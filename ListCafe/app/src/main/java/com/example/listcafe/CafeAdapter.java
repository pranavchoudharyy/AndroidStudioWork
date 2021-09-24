package com.example.listcafe;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import androidx.recyclerview.widget.RecyclerView;

        import java.util.List;

public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.MyViewHolder> {

    private List<cafe> CafeList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, rating, location;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            location = (TextView) view.findViewById(R.id.location);
            rating = (TextView) view.findViewById(R.id.rating);
        }
    }


    public CafeAdapter(List<cafe> cafeList) {
        this.CafeList = cafeList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cafe_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        cafe cafe = CafeList.get(position);
        holder.name.setText(cafe.getName());
        holder.location.setText(cafe.getLocation());
        holder.rating.setText(cafe.getRating());
    }

    @Override
    public int getItemCount() {
        return CafeList.size();
    }
}