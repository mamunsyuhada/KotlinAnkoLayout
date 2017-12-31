package xyz.mamunsyuhada.ankokotlinfirst

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class LayoutActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_layout)

        ViewAnkoMain().setContentView(this)


    }
    class ViewAnkoMain : AnkoComponent<LayoutActivity> {
        @SuppressLint("ResourceType")
        override fun createView(ui: AnkoContext<LayoutActivity>)= with(ui){

            verticalLayout {
                var nganu = editText {
                    hint = "input nama"
                }.lparams {
                    margin = 40
                    padding = 10
                    height = wrapContent
                    width = matchParent
                }

                button {
                    text = "coba"

                    onClick {

                        if (nganu.text.isNotEmpty()){
                            toast("${nganu.text}")
                        }
                        else if (nganu.text.isEmpty()){
                            toast("isi dulu")
                        }
                    }
                }.lparams {
                    margin = 40
                }

                //relative layout
                relativeLayout {
                    var tulisan = textView {
                        text = "hellow ini text view"
                        textSize = 20f
                        id = 1
                    }

                    button {
                        backgroundColor = Color.BLUE
                        onClick {
                            toast(tulisan.text)
                        }
                        text = "hei hehehe"
                    }.lparams {
                        margin = 40
                        below(1)
                        backgroundColor = Color.argb(255,254,88,88)
                    }
                }
            }
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}
