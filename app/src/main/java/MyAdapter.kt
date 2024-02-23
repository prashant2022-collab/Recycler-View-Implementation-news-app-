import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.News
import com.example.recycleview.R

class MyAdapter(var newsarraylist : ArrayList<News>) :
RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    // to create new view instance
    //  when layout manager fails to find the suitable view for each item

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
      val itemView   =  LayoutInflater.from(parent.context).inflate(R.layout.each_row,parent,false)
        return MyViewHolder(itemView)
    }

    // populate items with data
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       var currentItem = newsarraylist[position]
        holder.htitle.text = currentItem.newsreading
        holder.himage.setImageResource(currentItem.newsimage)


    }

    // how many list item are present in Your array
    override fun getItemCount(): Int {
      return newsarraylist.size
    }

    // it holds the view so that views cannot be created everytime, so that memory can be saved
    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        val htitle = itemView.findViewById<TextView>(R.id.tvheading)
        val himage = itemView.findViewById<ImageView>(R.id.newsimage)
    }
}