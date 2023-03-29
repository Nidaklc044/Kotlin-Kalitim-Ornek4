package com.nidakilic.lessonone.ntp.kalitim

class Mudur:Personel() {
    fun IseAl(personel: Personel){
        personel.IseAlındı()

    }
    fun terfiEt(personel: Personel){
      //  (personel as Ogretmen).MaasArttır()//as üst sınıfı alt sınıfa dönüştürebiliriz
        //veya bunu yerine tip kontrolü yapabiliriz

        if(personel is Ogretmen){
            personel.MaasArttır()
        }

        if(personel is Isci){
        println("işçi terfi alamaz")
        }
    }
}