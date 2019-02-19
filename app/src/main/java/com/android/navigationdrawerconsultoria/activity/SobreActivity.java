package com.android.navigationdrawerconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.navigationdrawerconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_sobre);

        String descricao = "A ATM consultoria foi um projeto desenvolvido para trabalharmos com vários recursos do Android \n \n +" +
                "Espero que seja util para outras pessoas como foi para mim";

        View sobre = new AboutPage(this)

                //permite que você configure a imagem superior
                .setImage(R.drawable.logo)

                //descrição para o "sobre"
                .setDescription( descricao )

                //você pode definir o grupo que está querendo criar
                .addGroup("Fale Conosco")

                //adicionando grupo de contato
                .addEmail("atmconsultoria@gmail.com", "Envie um e-mail")
                .addWebsite("http://google.com.br", "Acesse nosso site")

                .addGroup("Acesse nossas redes sociais")

                //adicionando grupo de redes sociais
                .addFacebook("google", "Facebook")
                .addTwitter("google", "Twitter")
                .addYoutube("google", "Youtube")
                .addPlayStore("com.google.android.apps.plus", "PlayStore")
                .addGitHub("https://github.com/CarolineMBorges", "GitHub")
                .addInstagram("google","Instagram")

                .create();

        setContentView( sobre );
    }
}
