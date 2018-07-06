/*
 * This file is generated by jOOQ.
*/
package de.samply.share.broker.model.db;


import de.samply.share.broker.model.db.tables.Action;
import de.samply.share.broker.model.db.tables.Authtoken;
import de.samply.share.broker.model.db.tables.Bank;
import de.samply.share.broker.model.db.tables.BankSite;
import de.samply.share.broker.model.db.tables.Consent;
import de.samply.share.broker.model.db.tables.Contact;
import de.samply.share.broker.model.db.tables.Document;
import de.samply.share.broker.model.db.tables.EmailSite;
import de.samply.share.broker.model.db.tables.Inquiry;
import de.samply.share.broker.model.db.tables.InquirySite;
import de.samply.share.broker.model.db.tables.Note;
import de.samply.share.broker.model.db.tables.Project;
import de.samply.share.broker.model.db.tables.ProjectSite;
import de.samply.share.broker.model.db.tables.Reply;
import de.samply.share.broker.model.db.tables.Site;
import de.samply.share.broker.model.db.tables.Tokenrequest;
import de.samply.share.broker.model.db.tables.User;
import de.samply.share.broker.model.db.tables.UserConsent;
import de.samply.share.broker.model.db.tables.UserSite;
import de.samply.share.broker.model.db.tables.records.ActionRecord;
import de.samply.share.broker.model.db.tables.records.AuthtokenRecord;
import de.samply.share.broker.model.db.tables.records.BankRecord;
import de.samply.share.broker.model.db.tables.records.BankSiteRecord;
import de.samply.share.broker.model.db.tables.records.ConsentRecord;
import de.samply.share.broker.model.db.tables.records.ContactRecord;
import de.samply.share.broker.model.db.tables.records.DocumentRecord;
import de.samply.share.broker.model.db.tables.records.EmailSiteRecord;
import de.samply.share.broker.model.db.tables.records.InquiryRecord;
import de.samply.share.broker.model.db.tables.records.InquirySiteRecord;
import de.samply.share.broker.model.db.tables.records.NoteRecord;
import de.samply.share.broker.model.db.tables.records.ProjectRecord;
import de.samply.share.broker.model.db.tables.records.ProjectSiteRecord;
import de.samply.share.broker.model.db.tables.records.ReplyRecord;
import de.samply.share.broker.model.db.tables.records.SiteRecord;
import de.samply.share.broker.model.db.tables.records.TokenrequestRecord;
import de.samply.share.broker.model.db.tables.records.UserConsentRecord;
import de.samply.share.broker.model.db.tables.records.UserRecord;
import de.samply.share.broker.model.db.tables.records.UserSiteRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>samply</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ActionRecord, Integer> IDENTITY_ACTION = Identities0.IDENTITY_ACTION;
    public static final Identity<AuthtokenRecord, Integer> IDENTITY_AUTHTOKEN = Identities0.IDENTITY_AUTHTOKEN;
    public static final Identity<BankRecord, Integer> IDENTITY_BANK = Identities0.IDENTITY_BANK;
    public static final Identity<ConsentRecord, Integer> IDENTITY_CONSENT = Identities0.IDENTITY_CONSENT;
    public static final Identity<ContactRecord, Integer> IDENTITY_CONTACT = Identities0.IDENTITY_CONTACT;
    public static final Identity<DocumentRecord, Integer> IDENTITY_DOCUMENT = Identities0.IDENTITY_DOCUMENT;
    public static final Identity<EmailSiteRecord, Integer> IDENTITY_EMAIL_SITE = Identities0.IDENTITY_EMAIL_SITE;
    public static final Identity<InquiryRecord, Integer> IDENTITY_INQUIRY = Identities0.IDENTITY_INQUIRY;
    public static final Identity<NoteRecord, Integer> IDENTITY_NOTE = Identities0.IDENTITY_NOTE;
    public static final Identity<ProjectRecord, Integer> IDENTITY_PROJECT = Identities0.IDENTITY_PROJECT;
    public static final Identity<ReplyRecord, Integer> IDENTITY_REPLY = Identities0.IDENTITY_REPLY;
    public static final Identity<SiteRecord, Integer> IDENTITY_SITE = Identities0.IDENTITY_SITE;
    public static final Identity<TokenrequestRecord, Integer> IDENTITY_TOKENREQUEST = Identities0.IDENTITY_TOKENREQUEST;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ActionRecord> ACTION_PKEY = UniqueKeys0.ACTION_PKEY;
    public static final UniqueKey<AuthtokenRecord> AUTHTOKEN_PKEY = UniqueKeys0.AUTHTOKEN_PKEY;
    public static final UniqueKey<AuthtokenRecord> AUTHTOKEN_VALUE_KEY = UniqueKeys0.AUTHTOKEN_VALUE_KEY;
    public static final UniqueKey<BankRecord> BANK_PKEY = UniqueKeys0.BANK_PKEY;
    public static final UniqueKey<BankRecord> BANK_EMAIL_KEY = UniqueKeys0.BANK_EMAIL_KEY;
    public static final UniqueKey<BankSiteRecord> BANK_SITE_PKEY = UniqueKeys0.BANK_SITE_PKEY;
    public static final UniqueKey<ConsentRecord> CONSENT_PKEY = UniqueKeys0.CONSENT_PKEY;
    public static final UniqueKey<ConsentRecord> CONSENT_VERSION_KEY = UniqueKeys0.CONSENT_VERSION_KEY;
    public static final UniqueKey<ContactRecord> CONTACT_PKEY = UniqueKeys0.CONTACT_PKEY;
    public static final UniqueKey<DocumentRecord> DOCUMENT_PKEY = UniqueKeys0.DOCUMENT_PKEY;
    public static final UniqueKey<EmailSiteRecord> EMAIL_SITE_PKEY = UniqueKeys0.EMAIL_SITE_PKEY;
    public static final UniqueKey<EmailSiteRecord> EMAIL_SITE_EMAIL_KEY = UniqueKeys0.EMAIL_SITE_EMAIL_KEY;
    public static final UniqueKey<InquiryRecord> INQUIRY_PKEY = UniqueKeys0.INQUIRY_PKEY;
    public static final UniqueKey<InquirySiteRecord> INQUIRY_SITE_PKEY = UniqueKeys0.INQUIRY_SITE_PKEY;
    public static final UniqueKey<NoteRecord> NOTE_PKEY = UniqueKeys0.NOTE_PKEY;
    public static final UniqueKey<ProjectRecord> PROJECT_PKEY = UniqueKeys0.PROJECT_PKEY;
    public static final UniqueKey<ProjectSiteRecord> PROJECT_SITE_PKEY = UniqueKeys0.PROJECT_SITE_PKEY;
    public static final UniqueKey<ReplyRecord> REPLY_PKEY = UniqueKeys0.REPLY_PKEY;
    public static final UniqueKey<SiteRecord> SITE_PKEY = UniqueKeys0.SITE_PKEY;
    public static final UniqueKey<SiteRecord> SITE_NAME_KEY = UniqueKeys0.SITE_NAME_KEY;
    public static final UniqueKey<TokenrequestRecord> TOKENREQUEST_PKEY = UniqueKeys0.TOKENREQUEST_PKEY;
    public static final UniqueKey<UserRecord> USER_PKEY = UniqueKeys0.USER_PKEY;
    public static final UniqueKey<UserRecord> USER_AUTHID_KEY = UniqueKeys0.USER_AUTHID_KEY;
    public static final UniqueKey<UserConsentRecord> USER_CONSENT_PKEY = UniqueKeys0.USER_CONSENT_PKEY;
    public static final UniqueKey<UserSiteRecord> USER_SITE_PKEY = UniqueKeys0.USER_SITE_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ActionRecord, ProjectRecord> ACTION__ACTION_PROJECT_ID_FKEY = ForeignKeys0.ACTION__ACTION_PROJECT_ID_FKEY;
    public static final ForeignKey<ActionRecord, UserRecord> ACTION__ACTION_USER_ID_FKEY = ForeignKeys0.ACTION__ACTION_USER_ID_FKEY;
    public static final ForeignKey<BankRecord, AuthtokenRecord> BANK__BANK_AUTHTOKEN_ID_FKEY = ForeignKeys0.BANK__BANK_AUTHTOKEN_ID_FKEY;
    public static final ForeignKey<BankSiteRecord, BankRecord> BANK_SITE__BANK_SITE_BANK_ID_FKEY = ForeignKeys0.BANK_SITE__BANK_SITE_BANK_ID_FKEY;
    public static final ForeignKey<BankSiteRecord, SiteRecord> BANK_SITE__BANK_SITE_SITE_ID_FKEY = ForeignKeys0.BANK_SITE__BANK_SITE_SITE_ID_FKEY;
    public static final ForeignKey<DocumentRecord, ProjectRecord> DOCUMENT__DOCUMENT_PROJECT_ID_FKEY = ForeignKeys0.DOCUMENT__DOCUMENT_PROJECT_ID_FKEY;
    public static final ForeignKey<DocumentRecord, InquiryRecord> DOCUMENT__DOCUMENT_INQUIRY_ID_FKEY = ForeignKeys0.DOCUMENT__DOCUMENT_INQUIRY_ID_FKEY;
    public static final ForeignKey<DocumentRecord, UserRecord> DOCUMENT__DOCUMENT_USER_ID_FKEY = ForeignKeys0.DOCUMENT__DOCUMENT_USER_ID_FKEY;
    public static final ForeignKey<EmailSiteRecord, SiteRecord> EMAIL_SITE__EMAIL_SITE_SITE_FKEY = ForeignKeys0.EMAIL_SITE__EMAIL_SITE_SITE_FKEY;
    public static final ForeignKey<InquiryRecord, ProjectRecord> INQUIRY__INQUIRY_PROJECT_ID_FKEY = ForeignKeys0.INQUIRY__INQUIRY_PROJECT_ID_FKEY;
    public static final ForeignKey<InquiryRecord, UserRecord> INQUIRY__INQUIRY_AUTHOR_ID_FKEY = ForeignKeys0.INQUIRY__INQUIRY_AUTHOR_ID_FKEY;
    public static final ForeignKey<InquirySiteRecord, InquiryRecord> INQUIRY_SITE__INQUIRY_SITE_INQUIRY_ID_FKEY = ForeignKeys0.INQUIRY_SITE__INQUIRY_SITE_INQUIRY_ID_FKEY;
    public static final ForeignKey<InquirySiteRecord, SiteRecord> INQUIRY_SITE__INQUIRY_SITE_SITE_ID_FKEY = ForeignKeys0.INQUIRY_SITE__INQUIRY_SITE_SITE_ID_FKEY;
    public static final ForeignKey<NoteRecord, UserRecord> NOTE__NOTE_AUTHOR_ID_FKEY = ForeignKeys0.NOTE__NOTE_AUTHOR_ID_FKEY;
    public static final ForeignKey<NoteRecord, ProjectRecord> NOTE__NOTE_PROJECT_ID_FKEY = ForeignKeys0.NOTE__NOTE_PROJECT_ID_FKEY;
    public static final ForeignKey<ProjectRecord, UserRecord> PROJECT__PROJECT_PROJECTLEADER_ID_FKEY = ForeignKeys0.PROJECT__PROJECT_PROJECTLEADER_ID_FKEY;
    public static final ForeignKey<ProjectSiteRecord, ProjectRecord> PROJECT_SITE__PROJECT_SITE_PROJECT_ID_FKEY = ForeignKeys0.PROJECT_SITE__PROJECT_SITE_PROJECT_ID_FKEY;
    public static final ForeignKey<ProjectSiteRecord, SiteRecord> PROJECT_SITE__PROJECT_SITE_SITE_ID_FKEY = ForeignKeys0.PROJECT_SITE__PROJECT_SITE_SITE_ID_FKEY;
    public static final ForeignKey<ReplyRecord, BankRecord> REPLY__REPLY_BANK_ID_FKEY = ForeignKeys0.REPLY__REPLY_BANK_ID_FKEY;
    public static final ForeignKey<ReplyRecord, InquiryRecord> REPLY__REPLY_INQUIRY_ID_FKEY = ForeignKeys0.REPLY__REPLY_INQUIRY_ID_FKEY;
    public static final ForeignKey<UserRecord, ContactRecord> USER__USER_CONTACT_ID_FKEY = ForeignKeys0.USER__USER_CONTACT_ID_FKEY;
    public static final ForeignKey<UserConsentRecord, UserRecord> USER_CONSENT__USER_CONSENT_USER_ID_FKEY = ForeignKeys0.USER_CONSENT__USER_CONSENT_USER_ID_FKEY;
    public static final ForeignKey<UserConsentRecord, ConsentRecord> USER_CONSENT__USER_CONSENT_CONSENT_ID_FKEY = ForeignKeys0.USER_CONSENT__USER_CONSENT_CONSENT_ID_FKEY;
    public static final ForeignKey<UserSiteRecord, UserRecord> USER_SITE__USER_SITE_USER_ID_FKEY = ForeignKeys0.USER_SITE__USER_SITE_USER_ID_FKEY;
    public static final ForeignKey<UserSiteRecord, SiteRecord> USER_SITE__USER_SITE_SITE_ID_FKEY = ForeignKeys0.USER_SITE__USER_SITE_SITE_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ActionRecord, Integer> IDENTITY_ACTION = createIdentity(Action.ACTION, Action.ACTION.ID);
        public static Identity<AuthtokenRecord, Integer> IDENTITY_AUTHTOKEN = createIdentity(Authtoken.AUTHTOKEN, Authtoken.AUTHTOKEN.ID);
        public static Identity<BankRecord, Integer> IDENTITY_BANK = createIdentity(Bank.BANK, Bank.BANK.ID);
        public static Identity<ConsentRecord, Integer> IDENTITY_CONSENT = createIdentity(Consent.CONSENT, Consent.CONSENT.ID);
        public static Identity<ContactRecord, Integer> IDENTITY_CONTACT = createIdentity(Contact.CONTACT, Contact.CONTACT.ID);
        public static Identity<DocumentRecord, Integer> IDENTITY_DOCUMENT = createIdentity(Document.DOCUMENT, Document.DOCUMENT.ID);
        public static Identity<EmailSiteRecord, Integer> IDENTITY_EMAIL_SITE = createIdentity(EmailSite.EMAIL_SITE, EmailSite.EMAIL_SITE.ID);
        public static Identity<InquiryRecord, Integer> IDENTITY_INQUIRY = createIdentity(Inquiry.INQUIRY, Inquiry.INQUIRY.ID);
        public static Identity<NoteRecord, Integer> IDENTITY_NOTE = createIdentity(Note.NOTE, Note.NOTE.ID);
        public static Identity<ProjectRecord, Integer> IDENTITY_PROJECT = createIdentity(Project.PROJECT, Project.PROJECT.ID);
        public static Identity<ReplyRecord, Integer> IDENTITY_REPLY = createIdentity(Reply.REPLY, Reply.REPLY.ID);
        public static Identity<SiteRecord, Integer> IDENTITY_SITE = createIdentity(Site.SITE, Site.SITE.ID);
        public static Identity<TokenrequestRecord, Integer> IDENTITY_TOKENREQUEST = createIdentity(Tokenrequest.TOKENREQUEST, Tokenrequest.TOKENREQUEST.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<ActionRecord> ACTION_PKEY = createUniqueKey(Action.ACTION, "action_pkey", Action.ACTION.ID);
        public static final UniqueKey<AuthtokenRecord> AUTHTOKEN_PKEY = createUniqueKey(Authtoken.AUTHTOKEN, "authtoken_pkey", Authtoken.AUTHTOKEN.ID);
        public static final UniqueKey<AuthtokenRecord> AUTHTOKEN_VALUE_KEY = createUniqueKey(Authtoken.AUTHTOKEN, "authtoken_value_key", Authtoken.AUTHTOKEN.VALUE);
        public static final UniqueKey<BankRecord> BANK_PKEY = createUniqueKey(Bank.BANK, "bank_pkey", Bank.BANK.ID);
        public static final UniqueKey<BankRecord> BANK_EMAIL_KEY = createUniqueKey(Bank.BANK, "bank_email_key", Bank.BANK.EMAIL);
        public static final UniqueKey<BankSiteRecord> BANK_SITE_PKEY = createUniqueKey(BankSite.BANK_SITE, "bank_site_pkey", BankSite.BANK_SITE.BANK_ID, BankSite.BANK_SITE.SITE_ID);
        public static final UniqueKey<ConsentRecord> CONSENT_PKEY = createUniqueKey(Consent.CONSENT, "consent_pkey", Consent.CONSENT.ID);
        public static final UniqueKey<ConsentRecord> CONSENT_VERSION_KEY = createUniqueKey(Consent.CONSENT, "consent_version_key", Consent.CONSENT.VERSION);
        public static final UniqueKey<ContactRecord> CONTACT_PKEY = createUniqueKey(Contact.CONTACT, "contact_pkey", Contact.CONTACT.ID);
        public static final UniqueKey<DocumentRecord> DOCUMENT_PKEY = createUniqueKey(Document.DOCUMENT, "document_pkey", Document.DOCUMENT.ID);
        public static final UniqueKey<EmailSiteRecord> EMAIL_SITE_PKEY = createUniqueKey(EmailSite.EMAIL_SITE, "email_site_pkey", EmailSite.EMAIL_SITE.ID);
        public static final UniqueKey<EmailSiteRecord> EMAIL_SITE_EMAIL_KEY = createUniqueKey(EmailSite.EMAIL_SITE, "email_site_email_key", EmailSite.EMAIL_SITE.EMAIL);
        public static final UniqueKey<InquiryRecord> INQUIRY_PKEY = createUniqueKey(Inquiry.INQUIRY, "inquiry_pkey", Inquiry.INQUIRY.ID);
        public static final UniqueKey<InquirySiteRecord> INQUIRY_SITE_PKEY = createUniqueKey(InquirySite.INQUIRY_SITE, "inquiry_site_pkey", InquirySite.INQUIRY_SITE.INQUIRY_ID, InquirySite.INQUIRY_SITE.SITE_ID);
        public static final UniqueKey<NoteRecord> NOTE_PKEY = createUniqueKey(Note.NOTE, "note_pkey", Note.NOTE.ID);
        public static final UniqueKey<ProjectRecord> PROJECT_PKEY = createUniqueKey(Project.PROJECT, "project_pkey", Project.PROJECT.ID);
        public static final UniqueKey<ProjectSiteRecord> PROJECT_SITE_PKEY = createUniqueKey(ProjectSite.PROJECT_SITE, "project_site_pkey", ProjectSite.PROJECT_SITE.PROJECT_ID, ProjectSite.PROJECT_SITE.SITE_ID);
        public static final UniqueKey<ReplyRecord> REPLY_PKEY = createUniqueKey(Reply.REPLY, "reply_pkey", Reply.REPLY.ID);
        public static final UniqueKey<SiteRecord> SITE_PKEY = createUniqueKey(Site.SITE, "site_pkey", Site.SITE.ID);
        public static final UniqueKey<SiteRecord> SITE_NAME_KEY = createUniqueKey(Site.SITE, "site_name_key", Site.SITE.NAME);
        public static final UniqueKey<TokenrequestRecord> TOKENREQUEST_PKEY = createUniqueKey(Tokenrequest.TOKENREQUEST, "tokenrequest_pkey", Tokenrequest.TOKENREQUEST.ID);
        public static final UniqueKey<UserRecord> USER_PKEY = createUniqueKey(User.USER, "user_pkey", User.USER.ID);
        public static final UniqueKey<UserRecord> USER_AUTHID_KEY = createUniqueKey(User.USER, "user_authid_key", User.USER.AUTHID);
        public static final UniqueKey<UserConsentRecord> USER_CONSENT_PKEY = createUniqueKey(UserConsent.USER_CONSENT, "user_consent_pkey", UserConsent.USER_CONSENT.USER_ID, UserConsent.USER_CONSENT.CONSENT_ID);
        public static final UniqueKey<UserSiteRecord> USER_SITE_PKEY = createUniqueKey(UserSite.USER_SITE, "user_site_pkey", UserSite.USER_SITE.USER_ID, UserSite.USER_SITE.SITE_ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<ActionRecord, ProjectRecord> ACTION__ACTION_PROJECT_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.PROJECT_PKEY, Action.ACTION, "action__action_project_id_fkey", Action.ACTION.PROJECT_ID);
        public static final ForeignKey<ActionRecord, UserRecord> ACTION__ACTION_USER_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.USER_PKEY, Action.ACTION, "action__action_user_id_fkey", Action.ACTION.USER_ID);
        public static final ForeignKey<BankRecord, AuthtokenRecord> BANK__BANK_AUTHTOKEN_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.AUTHTOKEN_PKEY, Bank.BANK, "bank__bank_authtoken_id_fkey", Bank.BANK.AUTHTOKEN_ID);
        public static final ForeignKey<BankSiteRecord, BankRecord> BANK_SITE__BANK_SITE_BANK_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.BANK_PKEY, BankSite.BANK_SITE, "bank_site__bank_site_bank_id_fkey", BankSite.BANK_SITE.BANK_ID);
        public static final ForeignKey<BankSiteRecord, SiteRecord> BANK_SITE__BANK_SITE_SITE_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.SITE_PKEY, BankSite.BANK_SITE, "bank_site__bank_site_site_id_fkey", BankSite.BANK_SITE.SITE_ID);
        public static final ForeignKey<DocumentRecord, ProjectRecord> DOCUMENT__DOCUMENT_PROJECT_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.PROJECT_PKEY, Document.DOCUMENT, "document__document_project_id_fkey", Document.DOCUMENT.PROJECT_ID);
        public static final ForeignKey<DocumentRecord, InquiryRecord> DOCUMENT__DOCUMENT_INQUIRY_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.INQUIRY_PKEY, Document.DOCUMENT, "document__document_inquiry_id_fkey", Document.DOCUMENT.INQUIRY_ID);
        public static final ForeignKey<DocumentRecord, UserRecord> DOCUMENT__DOCUMENT_USER_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.USER_PKEY, Document.DOCUMENT, "document__document_user_id_fkey", Document.DOCUMENT.USER_ID);
        public static final ForeignKey<EmailSiteRecord, SiteRecord> EMAIL_SITE__EMAIL_SITE_SITE_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.SITE_PKEY, EmailSite.EMAIL_SITE, "email_site__email_site_site_fkey", EmailSite.EMAIL_SITE.SITE);
        public static final ForeignKey<InquiryRecord, ProjectRecord> INQUIRY__INQUIRY_PROJECT_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.PROJECT_PKEY, Inquiry.INQUIRY, "inquiry__inquiry_project_id_fkey", Inquiry.INQUIRY.PROJECT_ID);
        public static final ForeignKey<InquiryRecord, UserRecord> INQUIRY__INQUIRY_AUTHOR_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.USER_PKEY, Inquiry.INQUIRY, "inquiry__inquiry_author_id_fkey", Inquiry.INQUIRY.AUTHOR_ID);
        public static final ForeignKey<InquirySiteRecord, InquiryRecord> INQUIRY_SITE__INQUIRY_SITE_INQUIRY_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.INQUIRY_PKEY, InquirySite.INQUIRY_SITE, "inquiry_site__inquiry_site_inquiry_id_fkey", InquirySite.INQUIRY_SITE.INQUIRY_ID);
        public static final ForeignKey<InquirySiteRecord, SiteRecord> INQUIRY_SITE__INQUIRY_SITE_SITE_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.SITE_PKEY, InquirySite.INQUIRY_SITE, "inquiry_site__inquiry_site_site_id_fkey", InquirySite.INQUIRY_SITE.SITE_ID);
        public static final ForeignKey<NoteRecord, UserRecord> NOTE__NOTE_AUTHOR_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.USER_PKEY, Note.NOTE, "note__note_author_id_fkey", Note.NOTE.AUTHOR_ID);
        public static final ForeignKey<NoteRecord, ProjectRecord> NOTE__NOTE_PROJECT_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.PROJECT_PKEY, Note.NOTE, "note__note_project_id_fkey", Note.NOTE.PROJECT_ID);
        public static final ForeignKey<ProjectRecord, UserRecord> PROJECT__PROJECT_PROJECTLEADER_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.USER_PKEY, Project.PROJECT, "project__project_projectleader_id_fkey", Project.PROJECT.PROJECTLEADER_ID);
        public static final ForeignKey<ProjectSiteRecord, ProjectRecord> PROJECT_SITE__PROJECT_SITE_PROJECT_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.PROJECT_PKEY, ProjectSite.PROJECT_SITE, "project_site__project_site_project_id_fkey", ProjectSite.PROJECT_SITE.PROJECT_ID);
        public static final ForeignKey<ProjectSiteRecord, SiteRecord> PROJECT_SITE__PROJECT_SITE_SITE_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.SITE_PKEY, ProjectSite.PROJECT_SITE, "project_site__project_site_site_id_fkey", ProjectSite.PROJECT_SITE.SITE_ID);
        public static final ForeignKey<ReplyRecord, BankRecord> REPLY__REPLY_BANK_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.BANK_PKEY, Reply.REPLY, "reply__reply_bank_id_fkey", Reply.REPLY.BANK_ID);
        public static final ForeignKey<ReplyRecord, InquiryRecord> REPLY__REPLY_INQUIRY_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.INQUIRY_PKEY, Reply.REPLY, "reply__reply_inquiry_id_fkey", Reply.REPLY.INQUIRY_ID);
        public static final ForeignKey<UserRecord, ContactRecord> USER__USER_CONTACT_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.CONTACT_PKEY, User.USER, "user__user_contact_id_fkey", User.USER.CONTACT_ID);
        public static final ForeignKey<UserConsentRecord, UserRecord> USER_CONSENT__USER_CONSENT_USER_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.USER_PKEY, UserConsent.USER_CONSENT, "user_consent__user_consent_user_id_fkey", UserConsent.USER_CONSENT.USER_ID);
        public static final ForeignKey<UserConsentRecord, ConsentRecord> USER_CONSENT__USER_CONSENT_CONSENT_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.CONSENT_PKEY, UserConsent.USER_CONSENT, "user_consent__user_consent_consent_id_fkey", UserConsent.USER_CONSENT.CONSENT_ID);
        public static final ForeignKey<UserSiteRecord, UserRecord> USER_SITE__USER_SITE_USER_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.USER_PKEY, UserSite.USER_SITE, "user_site__user_site_user_id_fkey", UserSite.USER_SITE.USER_ID);
        public static final ForeignKey<UserSiteRecord, SiteRecord> USER_SITE__USER_SITE_SITE_ID_FKEY = createForeignKey(de.samply.share.broker.model.db.Keys.SITE_PKEY, UserSite.USER_SITE, "user_site__user_site_site_id_fkey", UserSite.USER_SITE.SITE_ID);
    }
}