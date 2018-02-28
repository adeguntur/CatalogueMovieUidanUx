
package g.ade.cataloguemovieuidanux.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import g.ade.cataloguemovieuidanux.R;
import g.ade.cataloguemovieuidanux.model.ResultsItem;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    private List<ResultsItem> list = new ArrayList<>();

    public MovieAdapter() {
    }

    public void clearAll() {
        list.clear();
        notifyDataSetChanged();
    }

    public void replaceAll(List<ResultsItem> items) {
        list.clear();
        list = items;
        notifyDataSetChanged();
    }

    public void updateData(List<ResultsItem> items) {
        list.addAll(items);
        notifyDataSetChanged();
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MovieViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.activity_detail_item, parent, false
                )
        );
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return list.size();
    }
}
