package br.senai.sp.jandira.bmi.screens

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
import androidx.compose.foundation.layout.width
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
 fun ResultScreen(){

     Box(
         modifier = Modifier
             .fillMaxSize()
             .background(
                 brush = Brush.horizontalGradient(
                     listOf(
                         Color(0xFFC0EF7D),
                         Color(0xFF88BE58)
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
                     R.string.result
                 ),
                 modifier = Modifier
                     .padding(start = 20.dp),
                 color = Color.Black,
                 fontSize = 30.sp,
                 fontWeight = FontWeight.Bold
             )

             Card (
                 modifier = Modifier
                     .fillMaxSize()
                     .padding(top = 40.dp),

                 shape = RoundedCornerShape(
                     topStart = 35.dp,
                     topEnd = 35.dp
                 ),
                 colors = CardDefaults
                     .cardColors(
                         containerColor = Color.White
                     )

             ){

             }

         }

     }
 }

@Preview(showSystemUi = true)
@Composable
private fun UserDataPreview(){
    ResultScreen()
}


