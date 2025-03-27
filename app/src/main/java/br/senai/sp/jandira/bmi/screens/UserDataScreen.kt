package br.senai.sp.jandira.bmi.screens

import android.content.Context
import android.service.autofill.UserData
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
import androidx.compose.material.icons.filled.AssignmentInd
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.BedtimeOff
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen(modifier: Modifier = Modifier) {

    val context = LocalContext.current
    val userFile = context
        .getSharedPreferences("userFile", Context.MODE_PRIVATE)

    val userName = userFile.getString("user_name", "User name not found!")

    var nameOne = remember {
        mutableStateOf("")
    }
    var nameTwo = remember {
        mutableStateOf("")
    }
    var nameThree = remember {
        mutableStateOf("")
    }


    Box(
        modifier = Modifier
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
                    text = stringResource(R.string.hi) + ", ${userName}!",
                    modifier = Modifier
                        .padding(start = 20.dp),
                    color = Color.Black,
                    fontSize = 38.sp,
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
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 30.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally,

                    ){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Column (
                                modifier = Modifier,
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ){
                                Image(
                                    painter = painterResource(
                                        R.drawable.men
                                    ),
                                    contentDescription = stringResource(
                                        R.string.image
                                    ),
                                    modifier = Modifier
                                        .padding(top = 30.dp)
                                        .height(170.dp)
                                        .width(176.dp)

                                )
                                Button(
                                    onClick = {

                                    },
                                    shape = RoundedCornerShape(16.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFF0D27BE)
                                    )

                                ) {
                                    Text(
                                        text = stringResource(
                                            R.string.men
                                        ),
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding(end = 5.dp)
                                    )

                                }
                            }


                            Column (
                                modifier = Modifier,
                                horizontalAlignment = Alignment.CenterHorizontally,

                            ){
                                Image(
                                    painter = painterResource(
                                        R.drawable.woman
                                    ),
                                    contentDescription = stringResource(
                                        R.string.image
                                    ),
                                    modifier = Modifier
                                        .padding(top = 20.dp)
                                        .height(180.dp)
                                        .width(185.dp)

                                )
                                Button(
                                    onClick = {},
                                    shape = RoundedCornerShape(16.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFFE12F59)

                                    )

                                ) {
                                    Text(
                                        text = stringResource(
                                            R.string.woman
                                        ),
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding(end = 5.dp)

                                    )

                                }
                            }

                        }
                        OutlinedTextField(
                            value = nameOne.value,
                            onValueChange = {
                                nameOne.value = it

                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 60.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number,
                                    imeAction = ImeAction.Next
                                ),

                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Numbers,
                                    contentDescription = "",
                                    tint = Color(0xFFEC8666)
                                )
                            },
                            shape = RoundedCornerShape(18.dp),
                            label = {
                                Text(
                                    text = stringResource(R.string.age)
                                )
                            },

                        )
                        OutlinedTextField(

                            value = nameTwo.value,
                            onValueChange = {
                                nameTwo.value = it

                            },
                            modifier = Modifier

                                .fillMaxWidth()
                                .padding(top = 20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next
                            ),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Balance,
                                    contentDescription = "",
                                    tint = Color(0xFFEC8666)
                                )
                            },
                            shape = RoundedCornerShape(18.dp),
                            label = { Text(text = stringResource(R.string.weight)) }
                        )
                        OutlinedTextField(
                            value = nameThree.value,
                            onValueChange = {
                                nameThree.value = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Done
                            ),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Height,
                                    contentDescription = "",
                                    tint = Color(0xFFEC8666)
                                )
                            },
                            shape = RoundedCornerShape(18.dp),
                            label = { Text(text = stringResource(R.string.high)) }
                        )
                        Button(
                            modifier = Modifier
                                .width(500.dp)
                                .padding(top = 40.dp),

                            onClick = {
                                val editor = userFile.edit()
                                editor.putInt("user_age", nameOne.value.toInt())
                                editor.putInt("user_weight", nameTwo.value.toInt())
                                editor.putFloat("user_height", nameThree.value.toFloat())
                                editor.apply()
                            },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFF68B69)
                            )

                        ) {
                            Text(
                                text = stringResource(
                                    R.string.calculate
                                ),
                                fontSize = 25.sp,
                                modifier = Modifier
                                    .padding(3.dp)



                            )
                        }

                    }




                }


        }



    }
}
@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview(){
    UserDataScreen()
}