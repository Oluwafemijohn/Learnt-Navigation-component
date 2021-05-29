package com.example.navigationcomponentexample

import android.os.Parcelable
import java.math.BigDecimal
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Money(val amount:BigDecimal):Parcelable{

}
