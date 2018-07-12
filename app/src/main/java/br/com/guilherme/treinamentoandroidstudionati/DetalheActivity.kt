package br.com.guilherme.treinamentoandroidstudionati

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalhe.*

class DetalheActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)

        val matriculaExtra = intent.getStringExtra("matricula")
        val senhaExtra = intent.getStringExtra("senha")
        matriculaLabel.text = matriculaExtra
        senhaLabel.text = senhaExtra

    }

}