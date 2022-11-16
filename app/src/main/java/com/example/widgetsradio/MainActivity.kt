package com.example.widgetsradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.widgetsradio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy{ ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		binding.radioGroup.setOnCheckedChangeListener { group, chkId ->
		// group : 이벤트가 발생한 라디오버튼 그룹 객체를 의미
		// chkId : 이벤트를 발생시킨 라디오버튼의 id
		// R.id. : 안드로이드가 리소스를 관리할 때 사용하는 R이라는 클래스
		// R 클래스 안의 리소스들 아이디를 관리할 때 id 객체가 만들어 짐
		// 위젯의 id값을 사용할 때 R.id. 아이디러 사용하면 됨	
			if(chkId == R.id.radioApple){
				Log.d("radio", "사과를 선택하셨습니다.")
			}else if(chkId == R.id.radioBanana){
				Log.d("radio", "바나나를 선택하셨습니다.")
			}else if(chkId == R.id.radioOrange){
				Log.d("radio", "오렌지를 선택하셨습니다.")
			}
			// 위의 if문과 동일한 작업을 하는 when문을 작성
			when(chkId){
				R.id.radioApple -> { Log.d("radio1", "사과를 선택하셨습니다.") }
				R.id.radioBanana -> { Log.d("radio1", "바나나를 선택하셨습니다.") }
				R.id.radioOrange -> { Log.d("radio1", "오렌지를 선택하셨습니다.") }
			}
		}
	}
}

