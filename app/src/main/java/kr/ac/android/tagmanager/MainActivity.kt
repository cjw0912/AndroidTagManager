package kr.ac.android.tagmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kr.ac.android.tagmanager.ui.theme.TagManagerTheme
import kr.ac.android.tagmanager.ui.navigation.AppNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TagManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppNavGraph(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

/*
Todo
1. 여러 예시 이미지를 가로 1줄로 가진 버튼
    -버튼 맨 위는 프리셋 이름을 지정하고 수정도 가능해야 함
    -이미지는 가로 1줄로 작게 나열할 수 있어야 하며 이미지 갯수에 따라 가로 스크롤 가능
    -이미지 터치 시 크게 보기 기능
    -예시 이미지 아래는 실제 프롬프트 텍스트 영역
    -프롬프트가 일정 글자수 초과 시 이후 부분은 ...처리 및 오른쪽 구석 수정버튼
    -프롬프트 영역 터치 시 해당 프롬프트 클립보드 복사
    위 모든 영역이 하나의 직사각형 모양 버튼 또는 레이아웃에 담겨있음
    이 버튼이 세로 1줄로 나열해서 저장된 프리셋 갯수만큼 무한 스크롤 가능

 */