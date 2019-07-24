package com.example.muxichallenge

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.NotificationCompat.getExtras
import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator
import kotlinx.android.synthetic.main.activity_details_fruit.*
import kotlinx.android.synthetic.main.list_item_view.*
import org.jetbrains.anko.image
import java.lang.reflect.Array.get


class DetailsFruitActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_fruit)

        //Saving data from fruits
        val nome = intent.getStringExtra("nome")
        val price = intent.getStringExtra("price")
        val image = intent.getStringExtra("image")

        Toast.makeText(this,nome, Toast.LENGTH_LONG).show()

        //Send the variables to activity_details_fruit
        details_fruit_name.text = "Fruit:  $nome"
        details_fruit_price.text = "$:  $price"
        details_fruit_price_real.text = "R$: ${"%.2f".format(getReal(price.toDouble()))}"

        //Lib Picasso to transform URL's into images
        Picasso.get().load(image).into(details_fruit_image)

    }

    //Convert dolar to real
    fun getReal (priceDolar : Double): Double {
        return priceDolar * 3.77
    }
}

