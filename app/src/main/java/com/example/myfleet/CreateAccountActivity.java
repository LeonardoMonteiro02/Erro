package com.example.myfleet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    private EditText fullNameEditText;
    private EditText birthDateEditText;
    private EditText phoneEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText confirmPasswordEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account_page);

        fullNameEditText = findViewById(R.id.full_name);
        birthDateEditText = findViewById(R.id.date_of_birth);
        phoneEditText = findViewById(R.id.phone);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        confirmPasswordEditText = findViewById(R.id.confirm_password);
        saveButton = findViewById(R.id.save_button);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveAccount();
            }
        });
    }

    private void saveAccount() {
        // Obtenha os valores inseridos pelo usuário
        String fullName = fullNameEditText.getText().toString();
        String birthDate = birthDateEditText.getText().toString();
        String phone = phoneEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        String confirmPassword = confirmPasswordEditText.getText().toString();

        // Adicione aqui a lógica para salvar a conta ou realizar as validações necessárias

        // Exemplo: Verificar se os campos estão preenchidos
        if (fullName.isEmpty() || birthDate.isEmpty() || phone.isEmpty() ||
                email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        // Exemplo: Verificar se a senha e a confirmação de senha correspondem
        if (!password.equals(confirmPassword)) {
            Toast.makeText(this, "A senha e a confirmação de senha não correspondem", Toast.LENGTH_SHORT).show();
            return;
        }

        // Se chegou até aqui, os dados estão corretos e você pode prosseguir com a lógica de salvar a conta
        // ...

        // Exemplo: Exibir uma mensagem de sucesso
        Toast.makeText(this, "Conta criada com sucesso", Toast.LENGTH_SHORT).show();

        // Finalize a atividade e retorne à MainActivity
        finish();
    }
}
