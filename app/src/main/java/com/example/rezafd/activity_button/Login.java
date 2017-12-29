package com.example.rezafd.activity_button;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rezafd.activity_button.API.BaseActivity;
import com.example.rezafd.activity_button.Response.LoginResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends BaseActivity {
    @BindView(R.id.inputusername)
    EditText txtNRP;
    @BindView(R.id.inputpassword) EditText txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login) void doLogin() {
        Call<LoginResponse> call = getApi().login(txtNRP.getText().toString(), txtPass.getText().toString());
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, retrofit2.Response<LoginResponse> response) {
                if(response.isSuccessful()) {
                    LoginResponse res = response.body();
                    if(res.isSuccess()){
                        Toast.makeText(Login.this, "Login Berhasil", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Login.this, Profile.class);
                        intent.putExtra("Nama",res.getNama());
                        intent.putExtra("NRP",res.getNRP());
                        intent.putExtra("TmptLahir",res.getTmptLahir());
                        intent.putExtra("TglLahir",res.getTglLahir());
                        intent.putExtra("Jurusan",res.getJurusan());
                        intent.putExtra("Alamat",res.getAlamat());
                        intent.putExtra("NoHP",res.getNoHP());
                        intent.putExtra("Email",res.getEmail());
                        startActivity(intent);
                        finish();
                        log("berhasil");
                    } else {
                        Toast.makeText(Login.this, "Login Gagal, Coba Lagi!", Toast.LENGTH_LONG).show();
                        log("gagal");
                    }
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                log(t.toString());
            }
        });
    }


}
