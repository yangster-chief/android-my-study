package com.kestrel9.android.mystudy.main.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kestrel9.android.mystudy.BaseAdapter;
import com.kestrel9.android.mystudy.R;
import com.kestrel9.android.mystudy.network.response.OrderbookResponse;

/**
 * Mystudy
 * Class: AskListAdapter
 * Created by kestr on 2018-07-13.
 * <p>
 * Description:
 */
public class AskListAdapter extends BaseAdapter<OrderbookResponse.Ask> {

    public AskListAdapter(Context context) {
        super(context);
    }

    @Override
    protected View createView(Context context, ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.row_ask, viewGroup, false);
        return view;
    }

    @Override
    protected void bindView(OrderbookResponse.Ask item, BaseAdapter.ViewHolder viewHolder) {
        if (item != null){
            TextView tv_price = (TextView) viewHolder.getView(R.id.tv_price);
            TextView tv_qty = (TextView) viewHolder.getView(R.id.tv_qty);

            tv_price.setText(item.price);
            tv_qty.setText(item.qty);

        }

    }
}