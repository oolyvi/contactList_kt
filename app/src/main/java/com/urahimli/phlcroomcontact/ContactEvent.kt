package com.urahimli.phlcroomcontact

sealed interface ContactEvent {             //butun button event'lerini filan burada yaziriq

    object SaveContact : ContactEvent

    data class SetFirstName(val firstName: String) : ContactEvent
    data class SetLastName(val lastName: String) : ContactEvent
    data class SetPhoneNumber(val phoneNumber: String) : ContactEvent

    object ShowDialog : ContactEvent
    object HideDialog : ContactEvent

    data class SortContacts(val sortType: SortType) : ContactEvent
    data class DeleteContact(val contact: Contact) : ContactEvent

}