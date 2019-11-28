package com.gmail2548sov.primenumbersolehsuprun

import android.app.ProgressDialog.show
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Validators.or
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.lang.NumberFormatException
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity(), View.OnClickListener {



    //val mpre = ""

    //val txtCurrentValue = findViewById<TextView>(R.id.currentValue)
    //val txtLastPrNum: TextView =findViewById (R.id.currentValue)
    // lateinit var potok: AsynsPrimeNumbers
    // lateinit var primeNumbers: PrimeNumber

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var potok: AsynsPrimeNumbers
        var potok: com.gmail2548sov.primenumbersolehsuprun.AsynsPrimeNumbers

        val primeNumbers: PrimeNumber

        //эксперементируем)))
        //val btnStart: Button = findViewById(R.id.btnStart) //можно не набирать
        //val btnStop = findViewById<Button>(R.id.btnStop)
        //val txtCurrentValue = findViewById<TextView>(R.id.currentValue)
        //val txtLastPrNum: TextView =findViewById (R.id.currentValue)
        //val edText = findViewById<EditText>(R.id.inputMax)

        // val prBar = findViewById<ProgressBar>(R.id.progressBar)


        //btnStart.isEnabled=false


        //potok = AsynsPrimeNumbers()
        btnStart.setOnClickListener(this)
        btnStop.setOnClickListener((this))

    }



    override fun onClick(v: View) {
        //Toast.makeText(this, "Enter a positive number greater than two", Toast.LENGTH_LONG).show()
        when (v) {

            findViewById<Button>(R.id.btnStop) -> {AsynsPrimeNumbers().cancel(true)}

           findViewById<Button>(R.id.btnStart) -> {


                if (inputMax.text.toString() == "") {
                    Toast.makeText(
                        this,
                        "Enter a positive number greater than two",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                    return
                }

                //inputMax.setText("asdf")

                try {
                    Integer.parseInt(inputMax.text.toString())

                } catch (e: NumberFormatException) {

                    return
                }




                if (inputMax.text.toString().toLong() < 2L) {
                    Toast.makeText(
                        this,
                        "Enter a positive number greater than two",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    return
                }

                val n: Long = inputMax.text.toString().toLong()


                Log.d("lll", "$n")
                //if (n<2) {Toast.makeText(this, "Input you name", Toast.LENGTH_SHORT)
                //return}
                //if(TextUtils.isEmpty(inputMax.) {Toast.makeText(this, "Input you name", Toast.LENGTH_SHORT)
                //  return}

                // if (inputMaxis String) {

               val potok = AsynsPrimeNumbers()


                potok.execute(n)

               //potok.cancel(false)
                //btnStart.isEnabled=false
                //else return
            }
        }
    }



    inner class AsynsPrimeNumbers : AsyncTask<Long, Long, Void>() {


        override fun onPreExecute() {
            // currentValue.text = mpre


        }

        override fun doInBackground(vararg params: Long?): Void? {

            try {
                val n: Long = params[0] ?: 0
                val primenumbers: ArrayList<Long> = arrayListOf(2)
                var k: Int
                if (n==2L) {primenumbers.add(n)
                    publishProgress(n, n)}

                for (i in 3..n step 2) {

                    k = 0

                    for (j in 3..i step 2) {
                        if (isCancelled) {Log.d("Usam","asdfff")
                            return null}
                        if (j * j - 1 < i) {
                            if (i % j == 0L) {
                                k = 1
                                break
                            }
                        }
                    }

                    if (k == 0) {
                        primenumbers.add(i)
                        publishProgress(i, n)
                    }
                }


                var m = primenumbers.size


            } catch (e: Exception) {
            }


            //publishProgress(null)
            return null

        }


        override fun onProgressUpdate(vararg values: Long?) {
            super.onProgressUpdate(*values)
            var i = values[0] ?: 0
            val n = values[1] ?: 1
            var p = 100 * i / n
            progressBar.setProgress(p.toInt())
            lastPrime.text = "$i"
            percentValue.text = "$p%"

        }

        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
            progressBar.setProgress(100)
            percentValue.text = "100%"


        }

        override fun onCancelled() {
            super.onCancelled()
            percentValue.text = "7777"


        }


    }


}





