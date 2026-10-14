package kr.ac.android.tagmanager.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kr.ac.android.tagmanager.ui.main.HomeScreen
import kr.ac.android.tagmanager.ui.nai.NaiHomeScreen

@Composable
fun AppNavGraph(modifier : Modifier = Modifier){
    val navController = rememberNavController()
    //startDestination: 앱이 켜졌을 때 가장 먼저 보여줄 화면 주소
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ){
        //1단계: 홈 화면(버튼 3개: NAI/Comfy/Web)
        composable("home"){
            HomeScreen(
                onNavigateToNai = { navController.navigate("nai") }
            )
        }
        composable("nai") {
            //NAI->작가 조합, 단일 작가, 캐릭터...
            NaiHomeScreen(
                onNavigateToNaiStyle = {}
            )
        }
    }
}