package br.sp.senai.studyfy.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import br.sp.senai.studyfy.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaCadastro() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFFEE101))
    ) {

        // Logo e Título
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .align(Alignment.CenterHorizontally)
                .height(200.dp)
                .width(200.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(130.dp)
                    .align(Alignment.Center)
                    .padding(bottom = 20.dp),
                painter = painterResource(id = R.drawable.mascote),
                contentDescription = "Mascote"
            )

            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color(0xFF302F2F),
                text = "Cadastre-se",
                modifier = Modifier
                    .offset(x = 15.dp, y = 150.dp)


            )
        }

        // Fundo cinza inferior
        Box(
            modifier = Modifier
                .offset(x = 0.dp, y = 280.dp)
                .fillMaxHeight()
                .fillMaxWidth()
                .background(color = Color(0xFFEEEEEE))
                .align(Alignment.CenterHorizontally)
        )
    }

    // Box principal branco
    Box(
        modifier = Modifier
            .offset(x = 20.dp, y = 250.dp)
            .background(Color.White)
            .height(530.dp)
            .width(350.dp)
            .zIndex(1f)
    ) {
        Column(
            modifier = Modifier
                .padding(start = 20.dp, top = 30.dp)
                .height(830.dp)
                .width(310.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            // Texto de introdução
            Text(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                text = "Para ter maior desempenho nos seus estudos",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Campo de Email
            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Lock Icon",
                            tint = Color(0xFFFEE101)
                        )
                    }
                },
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent,
                    focusedLabelColor = Color(0xFFFEE101),
                    unfocusedLabelColor = Color(0xFFFEE101),
                    focusedBorderColor = Color(0xFFE9CE03),
                    unfocusedBorderColor = Color(0xFFE9CE03)
                ),
                label = {
                    Text(text = "Nome", color = Color.Black)
                }
            )


            // Campo de Senha
            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Lock Icon",
                            tint = Color(0xFFFEE101)
                        )
                    }
                },
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent,
                    focusedLabelColor = Color(0xFFFEE101),
                    unfocusedLabelColor = Color(0xFFFEE101),
                    focusedBorderColor = Color(0xFFE9CE03),
                    unfocusedBorderColor = Color(0xFFE9CE03)
                ),
                label = {
                    Text(text = "Email", color = Color.Black)
                }
            )

            // Novo Campo: Confirmar Senha
            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Lock Icon",
                            tint = Color(0xFFFEE101)
                        )
                    }
                },
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent,
                    focusedLabelColor = Color(0xFFFEE101),
                    unfocusedLabelColor = Color(0xFFFEE101),
                    focusedBorderColor = Color(0xFFE9CE03),
                    unfocusedBorderColor = Color(0xFFE9CE03)
                ),
                label = {
                    Text(text = "Senha", color = Color.Black)
                }
            )

            // Campo adicional: Nome
            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Call,
                            contentDescription = "Person Icon",
                            tint = Color(0xFFFEE101)
                        )
                    }
                },
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent,
                    focusedLabelColor = Color(0xFFFEE101),
                    unfocusedLabelColor = Color(0xFFFEE101),
                    focusedBorderColor = Color(0xFFE9CE03),
                    unfocusedBorderColor = Color(0xFFE9CE03)
                ),
                label = {
                    Text(text = "Telefone", color = Color.Black)
                }
            )

            Spacer(modifier = Modifier.height(2.dp))

            // Texto "Esqueceu a senha?"
            Row(
                modifier = Modifier.padding(top = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Ou cadastre-se com: ",
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(4.dp))

                Image(
                    painter = painterResource(id = R.drawable.googleimg),
                    contentDescription = "Logo do Google",
                    modifier = Modifier.size(24.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))



            Button(
                onClick = {},
                colors = ButtonDefaults
                    .buttonColors(Color(0xFFFEE101)),
                modifier = Modifier
                    .align(Alignment.End) // Posiciona o botão no final da coluna horizontalmente
                   // Adiciona um espaço entre os elementos acima
            ) {
                Text(text = "Prox. passo", color = Color.Black, letterSpacing = 1.sp)
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "",
                    tint = Color.Black
                )
            }
        }




    }

    }




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaCadastroPreview() {
    TelaCadastro()
}