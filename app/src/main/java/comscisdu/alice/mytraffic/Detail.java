package comscisdu.alice.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleTextView = (TextView) findViewById(R.id.textView3);   //ผูก textView3 กับตัวแปร titleTextView
        titleTextView.setText(getIntent().getStringExtra("Title")); //รับค่า Title จาก MainActivity (intent) มาแสดงที่  titleTextView

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));

        TextView detailTextView = (TextView) findViewById(R.id.textView4);
        detailTextView.setText(getIntent().getStringExtra("Detail"));


    }   //Main Method

    public void clickBack(View view) {  //คำสั้ง View view เป็นคำสั่งที่ทำให้เห็นหน้า UI จากไฟล์ xml
        finish();
    }

}   //Main Class
