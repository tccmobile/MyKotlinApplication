package com.example.drwill.mykotlinapplication

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var student = Person("Tommy", 20)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myLabel.text = "This is a test"

        myButton.text = "Click me!"

        myButton.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                myLabel.text = "You clicked!"
            }
        })

       /* myLabel.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                myLabel.setTextColor(Color.RED)
            }
        })
*/

        myLabel.setOnClickListener {
            myLabel.text = student.name
            myLabel.setTextColor(Color.RED)
        }
    }
}
