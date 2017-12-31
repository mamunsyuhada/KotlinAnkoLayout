package xyz.mamunsyuhada.ankokotlinfirst

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_common.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class CommonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)

        //nelpun
//        makeCall("0")

//        email("imam.sy11@gmail.com", "Anko Kotlin", "Anko Kotlin Imam Syuhada")
        //get nilai yang di intent sebelumnya
        var a = intent.getIntExtra("a", 0)
        var b = intent.getIntExtra("b", 0)

        //nampilkan make toast
        toast(a.toString() + " "+ b.toString())


        btnNelpun.onClick {
            makeCall("083867082745")
        }
        btnSMS.onClick {
            sendSMS("+6283867082745", "nganu")
        }
        btnSercing.onClick {
            browse("http://www.mertani.co.id")
        }
        btnShring.onClick {
            share("textnya", "Subjeknya")
        }
        btnKirimEmail.onClick {
            email("imam.sy11@gmail.com", "KotlinSubjek", "Kotlin Isi ankoooo")
        }
        btnAlert.onClick {
            alert("Kotlin itu Nganuuu, apalagi ada anko"){
                yesButton {
                    toast("Lanjutkeun") }
                noButton {
                    toast("Goyang")
                }
            }.show()

            alert {
                title = "Informasi"
                message = "ini pesan"

                positiveButton("yes", onClicked = {toast("button yess")})
                negativeButton("no", onClicked = {toast("button no")})
                neutralPressed("netral", onClicked = {toast("button netral")})
            }.show()

        }
    }
}
