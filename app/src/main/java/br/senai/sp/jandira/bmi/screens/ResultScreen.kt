package br.senai.sp.jandira.bmi.screens

import android.content.Context
import android.os.Build.VERSION_CODES.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R
import java.util.Locale

@Composable
 fun ResultScreen(navegacao: NavHostController?){
    val context = LocalContext.current
    val userFile = context
        .getSharedPreferences("userFile", Context.MODE_PRIVATE)

    val userWeight = userFile.getInt("user_weight", 0)
    val userHeight = userFile.getFloat("user_height", 0.0F)
    val userAge = userFile.getInt("user_age", 0)
     Box(
         modifier = Modifier
             .fillMaxSize()
             .fillMaxSize()
             .background(
                 brush = Brush.horizontalGradient(
                     listOf(
                         Color(0xFFEFAF69),
                         Color(0xFFE78921)
                     )
                 )
             )
     ){
         Column (
             modifier = Modifier
                 .fillMaxSize()
                 .width(20.dp)
                 .padding(top = 80.dp),
             verticalArrangement = Arrangement.Center,
         ){
             Text(
                 text = stringResource(
                     br.senai.sp.jandira.bmi.R.string.result
                 ),
                 modifier = Modifier
                     .padding(top = 20.dp),
                 color = Color.Black,
                 fontSize = 30.sp,
                 fontWeight = FontWeight.Bold
             )

         }
         Card (
             modifier = Modifier
                 .fillMaxSize()
                 .padding(top = 160.dp),

             shape = RoundedCornerShape(
                 topStart = 35.dp,
                 topEnd = 35.dp
             ),
             colors = CardDefaults
                 .cardColors(
                     containerColor = Color.White
                 )

         ){

             Column (
                 modifier = Modifier
                     .fillMaxSize()
                     .padding(top = 30.dp),
                 horizontalAlignment = Alignment.CenterHorizontally
             ) {
                 Card(
                     modifier = Modifier
                         .size(160.dp),
                     shape = CircleShape,
                     border = BorderStroke(
                         10.dp,
                         brush = Brush.horizontalGradient(
                             listOf(
                                 Color(0xFFFF9800),
                                 Color(0xFFFF9800)
                             )
                         )
                     )
                 ) {

                     Text(
                         text = stringResource(
                             br.senai.sp.jandira.bmi.R.string.data
                         ),
                         modifier = Modifier
                             .padding(top = 50.dp, start = 32.dp),
                         fontSize = 50.sp,
                         fontWeight = FontWeight.Bold,
                         color = Color.Black

                     )

                 }
                 Text(
                     text = stringResource(
                         br.senai.sp.jandira.bmi.R.string.obesity
                     ),
                     modifier = Modifier
                         .padding(top = 23.dp),
                     fontSize = 25.sp,
                     fontWeight = FontWeight.Bold,
                     color = Color.Black
                 )
                 Card (
                     shape = RoundedCornerShape(
                         15.dp
                     ),
                     modifier = Modifier
                         .padding(bottom = 20.dp, top = 20.dp)
                 ){
                     Row (
                         modifier = Modifier
                             .background(
                                 color = Color(0xFFE3A156)
                             )
                             .padding(6.dp)
                     ){
                         Column (
                             modifier = Modifier
                                 .weight(1f),
                             horizontalAlignment = Alignment.CenterHorizontally
                         ){
                             Text(
                                 text = stringResource(
                                     br.senai.sp.jandira.bmi.R.string.age
                                 ),
                                 color = Color.Black,
                                 fontSize = 25.sp
                             )
                             Text(
                                 text = "${userAge}",
                                 color = Color.Black,
                                 fontSize = 25.sp
                             )
                         }

                         VerticalDivider(
                             modifier = Modifier
                                 .height(60.dp),
                             color = Color.Gray
                         )
                         Column (
                             modifier = Modifier
                                 .weight(1f),
                             horizontalAlignment = Alignment.CenterHorizontally
                         ){
                             Text(
                                 text = stringResource(
                                     br.senai.sp.jandira.bmi.R.string.weight
                                 ),
                                 color = Color.Black,
                                 fontSize = 25.sp
                             )
                             Text(
                                 text = "${userWeight}",
                                 color = Color.Black,
                                 fontSize = 25.sp
                             )
                         }
                         VerticalDivider(
                             modifier = Modifier
                                 .height(60.dp),
                             color = Color.Gray
                         )
                         Column (
                             modifier = Modifier
                                 .weight(1f),
                             horizontalAlignment = Alignment.CenterHorizontally
                         ){
                             Text(
                                 text = stringResource(
                                     br.senai.sp.jandira.bmi.R.string.high
                                 ),
                                 color = Color.Black,
                                 fontSize = 25.sp
                             )
                             Text(
                                 text = String.format(Locale.getDefault(), "%.2f", userHeight),
                                 color = Color.Black,
                                 fontSize = 25.sp
                             )
                         }

                     }
                     Button(
                         onClick = {
                             navegacao!!.navigate("dados")
                         },
                         shape = RoundedCornerShape(10.dp),
                         modifier = Modifier
                             .fillMaxWidth()
                             .height(50.dp),
                         colors = ButtonDefaults.buttonColors(
                             containerColor = Color(0xFFFF9800)
                         )
                     ) {
                         Text(
                             text = stringResource(
                                 br.senai.sp.jandira.bmi.R.string.calculate
                             ),
                             fontSize = 25.sp
                         )
                     }
                 }

             }

         }

     }
 }

@Preview(showSystemUi = true)
@Composable
private fun ResultScreenPreview(){
    ResultScreen(navegacao = null)
}