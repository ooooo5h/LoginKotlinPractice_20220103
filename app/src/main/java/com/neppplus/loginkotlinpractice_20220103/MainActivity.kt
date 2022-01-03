package com.neppplus.loginkotlinpractice_20220103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        로그인 버튼이 눌리면 할 일
        btnLogin.setOnClickListener {


//        1. 입력한 아이디와 비밀번호가 무엇인지 변수에 담아두자
            val inputId = edtEmail.text.toString()
            val inputPw = edtPassword.text.toString()

//        2. id : admin(비교연산), pw : qwer1234 두 개가 모두 맞다면(논리연산) + (조건문), 토스트로 "관리자입니다.
//        => 둘 중 하나라도 틀리면 "로그인 실패" 토스트
            
            if (inputId == "admin" && inputPw == "qwer1234"){

                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }
    }
}