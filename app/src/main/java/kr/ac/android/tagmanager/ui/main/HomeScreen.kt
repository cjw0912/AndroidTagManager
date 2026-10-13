package kr.ac.android.tagmanager.ui.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import kr.ac.android.tagmanager.ui.theme.TagManagerTheme
import kr.ac.android.tagmanager.R

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
                modifier = Modifier.height(80.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_placeholder),
                        contentDescription = "아이콘 이미지",
                        modifier = Modifier.size(40.dp)
                    )
                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "NAI",
                        fontSize = 16.sp
                    )
                }
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