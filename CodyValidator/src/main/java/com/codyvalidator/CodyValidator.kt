package com.codyvalidator

import java.util.regex.Pattern

object CodyValidator {

    fun String.isOtpValid(): Boolean {
        val otpRegex = Pattern.compile("^[0-9]{6}$")
        return otpRegex.matcher(this).matches()
    }

    fun String.isPasswordValid(): Boolean {
        val regex =
            Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}")
        return regex.matcher(this).matches()
    }
    fun String.isPhoneNumberValid(): Boolean {
        val regexPattern = Pattern.compile("^[6-9][0-9]{9}$")
        return regexPattern.matcher(this).matches()
    }
    fun String.isEmailValid(): Boolean {
        val emailRegex = Pattern.compile("^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})")
        return emailRegex.matcher(this).matches()
    }

    fun String.isUsernameValid(): Boolean {
        val usernameRegex = Pattern.compile("^[A-Za-z0-9_]{5,15}$")
        return usernameRegex.matcher(this).matches()
    }

    fun String.isHexColorValid(): Boolean {
        val hexColorRegex = Pattern.compile("^#(?:[0-9a-fA-F]{3}){1,2}$")
        return hexColorRegex.matcher(this).matches()
    }

    fun String.isCreditCardValid(): Boolean {
        val creditCardRegex = Pattern.compile("^\\d{16}$")
        return creditCardRegex.matcher(this).matches()
    }

    fun String.isDateValid(): Boolean {
        val dateRegex = Pattern.compile("^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$")
        return dateRegex.matcher(this).matches()
    }

    fun String.isBankAccountNumberValid(): Boolean {
        val bankRegex = Pattern.compile("^\\d{9,18}$")
        return bankRegex.matcher(this).matches()
    }
    fun String.isIFSCCodeValid(): Boolean {
        val ifscRegex = Pattern.compile("^[A-Z]{4}0[A-Z0-9]{6}$")
        return ifscRegex.matcher(this).matches()
    }
    fun String.isSWIFTCodeValid(): Boolean {
        val swiftRegex = Pattern.compile("^[A-Z0-9]{8,11}$")
        return swiftRegex.matcher(this).matches()
    }
    fun String.isRoutingNumberValid(): Boolean {
        val routingRegex = Pattern.compile("^\\d{9}$")
        return routingRegex.matcher(this).matches()
    }
    fun String.isIBANValid(): Boolean {
        val ibanRegex = Pattern.compile("^[A-Z]{2}\\d{2}[A-Z0-9]{11,30}$")
        return ibanRegex.matcher(this).matches()
    }
    fun String.isTaxIdentificationNumberValid(): Boolean {
        val tinRegex = Pattern.compile("^\\d{9,15}$")
        return tinRegex.matcher(this).matches()
    }
    fun String.isCvvValid(): Boolean {
        val cvvRegex = Pattern.compile("^\\d{3,4}$")
        return cvvRegex.matcher(this).matches()
    }
    fun String.isBankCardNumberValid(): Boolean {
        val bankCardRegex = Pattern.compile("^\\d{13,19}$")
        return bankCardRegex.matcher(this).matches()
    }
    fun myToast() {
        // Custom toast method implementation here
    }


}