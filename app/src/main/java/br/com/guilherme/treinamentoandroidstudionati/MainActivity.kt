package br.com.guilherme.treinamentoandroidstudionati

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configurarBotao()


    }


    private fun configurarBotao() {
        botaoEntrar.setOnClickListener {

                val extraBundle = Bundle()
                extraBundle.putString("matricula", tfMatricula.text.toString())
                extraBundle.putString("senha", tfSenha.text.toString())

                val intentDetalheActivity = Intent(this, DetalheActivity::class.java)
                intentDetalheActivity.putExtras(extraBundle)
                startActivity(intentDetalheActivity)



        }

        }
    }





