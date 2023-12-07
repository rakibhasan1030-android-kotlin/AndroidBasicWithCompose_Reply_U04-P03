package rakib.hasan.reply.ui

import rakib.hasan.reply.data.Email
import rakib.hasan.reply.data.MailboxType
import rakib.hasan.reply.data.local.LocalEmailsDataProvider


data class ReplyUiState(
    val mailboxes: Map<MailboxType, List<Email>> = emptyMap(),
    val currentMailbox: MailboxType = MailboxType.Inbox,
    val currentSelectedEmail: Email = LocalEmailsDataProvider.defaultEmail,
    val isShowingHomepage: Boolean = true
) {
    val currentMailboxEmails: List<Email> by lazy { mailboxes[currentMailbox]!! }
}