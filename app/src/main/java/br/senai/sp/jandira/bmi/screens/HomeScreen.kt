package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AssignmentInd
import androidx.compose.material.icons.filled.BedtimeOff
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R

@Composable
fun HomeScreen(navegacao: NavHostController) {

    var nameState = remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFFB27DEF),
                        Color(0xFF94E9F5)
                    )
                )
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(
                    R.drawable.workout
                ),
                contentDescription = stringResource(
                    R.string.logo
                ),
                modifier = Modifier
                    .padding(top = 80.dp)
            )
            Text(
                text = stringResource(
                    R.string.welcome
                ),
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                shape = RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp
                ),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color.White
                    )

            ) {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.End
                ){
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()

                    ){
                        Text(
                            text = stringResource(
                                R.string.your_name
                            ),
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold
                        )
                        TextField(
                            value = nameState.value,
                            onValueChange = {
                                nameState.value = it

                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 12.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Text,
                                capitalization = KeyboardCapitalization.Words
                            ),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.AssignmentInd,
                                    contentDescription = "",
                                    tint = Color(0xFF4034C7)
                                )
                            },
                            trailingIcon = {
                                Icon(
                                    imageVector = Icons.Default.BedtimeOff,
                                    contentDescription = "",
                                    tint = Color(0xFF4034C7)
                                )
                            }
                        )
                    }
                    Button(
                        onClick = {
                            navegacao.navigate("dados")
                        },
                        shape = RoundedCornerShape(8.dp)

                    ) {
                        Text(
                            text = stringResource(
                                R.string.next
                            ),
                            fontSize = 17.sp,
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
private fun HomeScreenPreview() {
    //HomeScreen()
    
}