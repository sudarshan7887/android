public class MainActivity extends AppCompatActivity {
EditText username,password;
Button loginButton;
String user = "ss";
String pass = "ss";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.activity_main_usernameEditText);
        password = (EditText)findViewById(R.id.activity_main_passwordEditText);
        loginButton = (Button)findViewById(R.id.activity_main_loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.equals(username.getText().toString())&& pass.equals(password.getText().toString()))
                {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invaild Username & Passward", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
