package com.urahimli.phlcroomcontact

data class ContactState(          //deyise bilenleri evvelceden burada qeyd edirik
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME
)
