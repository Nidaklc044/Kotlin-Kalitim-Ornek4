package com.nidakilic.lessonone.ntp.kalitim

fun main(){
    val ogretmen:Personel=  Ogretmen()
    val isci:Personel=Isci()
    val mudur=Mudur()

  mudur.terfiEt(ogretmen)
  mudur.terfiEt(isci)
}