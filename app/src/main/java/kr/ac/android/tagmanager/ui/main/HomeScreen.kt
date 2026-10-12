package kr.ac.android.tagmanager.ui.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ac.android.tagmanager.ui.theme.TagManagerTheme

@Composable
fun HomeScreen(
    onNavigateToNai: () -> Unit
    //TODO "작가 조합, 단일 작가, 캐릭터 버튼 연결"
){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
        contentPadding = PaddingValues(16.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Button(
                onNavigateToNai,
                modifier = Modifier.height(80.dp)
            ) {
                Text("NAI")
            }
        }
        item {
            Button(
                {},
                modifier = Modifier.height(80.dp)
            ) {
                Text("Test1")
            }
        }
        item {
            Button(
                {},
                modifier = Modifier.height(80.dp)
            ) {
                Text("Test2")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    TagManagerTheme()  {
        HomeScreen(onNavigateToNai = {} )
    }
}