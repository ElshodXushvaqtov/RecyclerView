package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import uz.itschool.myapplication.adapter.Item_adapter
import uz.itschool.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val sport_imgs=ArrayList<Item>()
        sport_imgs.add(Item("https://w7.pngwing.com/pngs/248/249/png-transparent-american-football-football-team-football-sport-sports-equipment-football-team-thumbnail.png","Football"))
        sport_imgs.add(Item("https://i.etsystatic.com/15536434/r/il/a82848/2483707629/il_fullxfull.2483707629_j8vt.jpg","Rugby"))
        sport_imgs.add(Item("https://www.citypng.com/public/uploads/preview/download-hd-basketball-ball-png-11650715086wppu5ah0rp.png","Basketball"))
        sport_imgs.add(Item("https://w7.pngwing.com/pngs/111/16/png-transparent-volleyball-illustration-volleyball-ball-sport-sphere-beach-volleyball.png","Volleyball"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        sport_imgs.add(Item("https://png.pngtree.com/element_pic/00/16/08/2957c3ed12285d1.jpg","Tennis"))
        val adapter=Item_adapter(sport_imgs)
        binding.rv.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        binding.rv.adapter=adapter
    }
}