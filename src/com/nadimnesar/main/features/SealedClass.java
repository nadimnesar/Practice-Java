package com.nadimnesar.main.features;

public sealed class SealedClass permits AdminsClass {
}

final class AdminsClass extends SealedClass {

}

//class UsersClass extends SealedClass { not possible
//
//}