package com.gmail2548sov.primenumbersolehsuprun

import android.os.AsyncTask
import android.widget.TextView
import java.nio.file.Files.find

import java.util.concurrent.TimeUnit

class AsynsPrimeNumbers: AsyncTask  <Void, Void, Void>() {



    override fun doInBackground(vararg params: Void?): Void? {

        try {

            for(i in 1..5){

            TimeUnit.SECONDS.sleep(5)
            }
        }
        catch (e: Exception) {
        }
        return null


        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onPreExecute(){



    }
    override fun onProgressUpdate(vararg values: Void?) {
        super.onProgressUpdate(*values)




        }
    override fun onPostExecute(result: Void?) {
        super.onPostExecute(result)

    }




}