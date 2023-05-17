package com.example.myfleet;


import android.graphics.Typeface;
import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

public class LoginPageActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginEmailButton;
    private Button loginFacebookButton;
    private Button loginButton;
    private TextView createAccountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        loginEmailButton = findViewById(R.id.buttonLoginEmail);
        loginFacebookButton = findViewById(R.id.buttonFacebook);
        loginButton = findViewById(R.id.buttonLogin);
        createAccountTextView = findViewById(R.id.textViewCreateAccount);

        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/LTC Kennerley W00 Small Caps.ttf");
        createAccountTextView.setTypeface(customFont);


        loginEmailButton.setOnClickListener(this);
        loginFacebookButton.setOnClickListener(this);
        loginButton.setOnClickListener(this);
        createAccountTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonLoginEmail) {
            Toast.makeText(this, "Entrar com Gmail pressionado", Toast.LENGTH_SHORT).show();
            // Adicione aqui a lógica para a ação do botão "Entrar com Gmail"
        } else if (v.getId() == R.id.buttonFacebook) {
            Toast.makeText(this, "Entrar com Facebook pressionado", Toast.LENGTH_SHORT).show();
            // Adicione aqui a lógica para a ação do botão "Entrar com Facebook"
        } else if (v.getId() == R.id.buttonLogin) {
            Toast.makeText(this, "Login Criado pressionado", Toast.LENGTH_SHORT).show();
            // Adicione aqui a lógica para a ação do botão "Login Criado"
        } else if (v.getId() == R.id.textViewCreateAccount) {
            Toast.makeText(this, "Problemas com login? pressionado", Toast.LENGTH_SHORT).show();
            // Adicione aqui a lógica para a ação do texto "Problemas com login?"
        }
    }
}
