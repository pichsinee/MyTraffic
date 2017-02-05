package comscisdu.alice.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aom on 5/2/2560.
 */

public class MyAdapter extends BaseAdapter{

    //Explicit การประกาศตัวแปร
    private Context context;
    private int[] ints;     //เก็บตัวแปร icon ที่เป็นรูป ในแบบ array ตำแหน่งรูปภาพส่งในรูปของ integer
    private String[] titleStrings, detailStrings;

    public MyAdapter(Context context,
                     int[] ints,
                     String[] titleStrings,
                     String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }


    @Override
    public int getCount() {  //นับค่า จำนวนข้อมูล ว่ามีกี่ข้อมูล แล้วส่งต่อไปยัง method getView
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {   //นำข้อมูลที่ได้จาก method getCount มาแสดงผลบนแอพ

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); // LayoutInflater เป็น Layout เสมือนที่ใช้แสดงผลข้อมูลหน้าแอพ โดยต้องขอใช้ service ที่คำสั่ง getSystemService
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);   //inflate เอาค่าจาก XML มาแแสดงผล บน layout ที่ชื่อ my_listview โดยแสดงข้อมูลทั้งหมด (ทั้ง viewGroup) โดยไม่ต้องมี security (เป็น false)

        //Initial view  ผูกชื่อ id ของ view กับตัวแปร
        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView); //คำสั่ง findViewById เป็นคำสั่งที่ผูก view (ด้วยชื่อ id) กับ ตัวแปร
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView);
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView2);

        //Show view เป็นการนำข้อมูลไปแสดงผลบนแอพ
        imageView.setImageResource(ints[i]);  //นำรูปภาพจากตัวแปร ints[i] มาแสดงบน image view ที่ชื่อ imageView ในแต่ละตำแหน่ง โดยใช้คำสั่ง setImageResource
        titleTextView.setText(titleStrings[i]);  //นำข้อความ title จากตัวแปร titleStrings[i] มาแสดงบน text view ที่ชื่อ titleTextView ในแต่ละตำแหน่ง โดยใช้คำสั่ง setText
        detailTextView.setText(detailStrings[i]);  //นำข้อความ detail จากตัวแปร detailStrings[i] มาแสดงบน text view ที่ชื่อ detailTextView ในแต่ละตำแหน่ง โดยใช้คำสั่ง setText

        return view1;
    }
} //Main Class
