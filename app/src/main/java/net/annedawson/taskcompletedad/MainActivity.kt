/*
Date: Wednesday 19th October 2022, 14:36 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
App: TaskCompletedAD
File: MainActivity.kt
Codelab title: Practice: Compose Basics - "Task Completed" (aka "Task Manager")
Status: Completed
 */

package net.annedawson.taskcompletedad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.annedawson.taskcompletedad.ui.theme.TaskCompletedADTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskCompletedADTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   MyApp()
                }
            }
        }
    }
}



@Composable
fun MyApp() {
    MyScreen(stringResource(R.string.message1_string), stringResource(R.string.message2_string))
}

@Composable
fun MyScreen(text1: String, text2: String, modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.ic_task_completed)

    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        Image(
            painter = image,
            contentDescription = null
        )

        Text(
            text = text1,
            fontSize = 24.sp,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
            )
        Text(
            text = text2,
            fontSize = 16.sp)

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskCompletedADTheme {
        MyScreen("Preview Text","Preview Text again")
    }
}