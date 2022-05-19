public class MainActivity extends AppCompatActivity {
private EditText mEdittxtTo,mEdittxtsubject,mEdittxtmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mEdittxtTo = findViewById(R.id.edit_text_to);
    mEdittxtsubject = findViewById(R.id.edit_text_subject);
    mEdittxtmessage = findViewById(R.id.edit_text_message);

    Button buttonsend = findViewById(R.id.button_send);
    buttonsend.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sendMail();
        }
    });
    }
    private void sendMail()
    {
        String recipientList = mEdittxtTo.getText().toString();
        String[] recipient = recipientList.split(",");
        String subject = mEdittxtsubject.getText().toString();
        String message = mEdittxtmessage.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,recipient);
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,message);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose an email client"));

    }
}

