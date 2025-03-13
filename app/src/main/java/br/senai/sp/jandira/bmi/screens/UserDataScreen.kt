package br.senai.sp.jandira.bmi.screens

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen(modifier: Modifier = Modifier) {

    var nameNumber = remember {
        mutableStateOf("")
    }

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
                .padding(top = 150.dp),
            verticalArrangement = Arrangement.Center
        ){
                Text(
                    text = stringResource(
                        R.string.hello
                    ),
                    color = Color.Black,
                    fontSize = 38.sp,
                    fontWeight = FontWeight.Bold
                )
            Column (

            ){
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 60.dp)
                        .height(705.dp),

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
                            .padding()

                    ){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Column (

                            ){
                                Image(
                                    painter = painterResource(
                                        R.drawable.men
                                    ),
                                    contentDescription = stringResource(
                                        R.string.image
                                    ),
                                    modifier = Modifier
                                        .padding(top = 50.dp)
                                        .height(180.dp)
                                        .width(180.dp)

                                )
                                Button(
                                    onClick = {},
                                    shape = RoundedCornerShape(20.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFFE91E63)
                                    )

                                ) {
                                    Text(
                                        text = stringResource(
                                            R.string.men
                                        ),
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding( 3.dp)

                                    )

                                }
                            }


                            Column (

                            ){
                                Image(
                                    painter = painterResource(
                                        R.drawable.woman
                                    ),
                                    contentDescription = stringResource(
                                        R.string.image
                                    ),
                                    modifier = Modifier
                                        .padding(top = 50.dp)
                                        .height(180.dp)
                                        .width(180.dp)

                                )
                                Button(
                                    onClick = {},
                                    shape = RoundedCornerShape(20.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFF2439AF)
                                    )

                                ) {
                                    Text(
                                        text = stringResource(
                                            R.string.woman
                                        ),
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding(end = 3.dp)

                                    )

                                }
                            }

                        }
                    }

                    OutlinedTextField(
                        value = nameNumber.value,
                        onValueChange = {
                            nameNumber.value = it

                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                        ),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Numbers,
                                contentDescription = "",
                                tint = Color(0xFF2C612C)
                            )
                        },

                        )
                    OutlinedTextField(

                        value = nameNumber.value,
                        onValueChange = {
                            nameNumber.value = it

                        },
                        modifier = Modifier

                            .fillMaxWidth()
                            .padding(top = 20.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                        ),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Balance,
                                contentDescription = "",
                                tint = Color(0xFF2C642B)
                            )
                        },
                    )
                    OutlinedTextField(
                        value = nameNumber.value,
                        onValueChange = {
                            nameNumber.value = it
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                        ),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Height,
                                contentDescription = "",
                                tint = Color(0xFF2B672B)
                            )
                        },
                    )
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(
                            text = stringResource(
                                R.string.calculate
                            ),
                            fontSize = 35.sp,
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
private fun UserDataPreview(){
    UserDataScreen()
}