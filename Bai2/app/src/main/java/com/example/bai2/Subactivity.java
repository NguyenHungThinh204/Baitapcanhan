public class subactivity extends AppCompatActivity { Button btnok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub super.onCreate(savedInstanceState); setContentView(R.layout.activity_sub); btnok = findViewById(R.id.btnok);
        btnok.setOnClickListener(new View.OnClickListener() { @Override

        public void onClick(View v) {
// TODO Auto-generated method stub finish();
        }
        });
    }
}
