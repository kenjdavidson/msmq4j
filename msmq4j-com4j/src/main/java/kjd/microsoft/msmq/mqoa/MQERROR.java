package kjd.microsoft.msmq.mqoa  ;

import com4j.*;

/**
 * <p>
 * Enumerates all Message Queuing errors.
 * </p>
 */
public enum MQERROR implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1072824319
   * </p>
   */
  MQ_ERROR(-1072824319),
  /**
   * <p>
   * The value of this constant is -1072824318
   * </p>
   */
  MQ_ERROR_PROPERTY(-1072824318),
  /**
   * <p>
   * The value of this constant is -1072824317
   * </p>
   */
  MQ_ERROR_QUEUE_NOT_FOUND(-1072824317),
  /**
   * <p>
   * The value of this constant is -1072824316
   * </p>
   */
  MQ_ERROR_QUEUE_NOT_ACTIVE(-1072824316),
  /**
   * <p>
   * The value of this constant is -1072824315
   * </p>
   */
  MQ_ERROR_QUEUE_EXISTS(-1072824315),
  /**
   * <p>
   * The value of this constant is -1072824314
   * </p>
   */
  MQ_ERROR_INVALID_PARAMETER(-1072824314),
  /**
   * <p>
   * The value of this constant is -1072824313
   * </p>
   */
  MQ_ERROR_INVALID_HANDLE(-1072824313),
  /**
   * <p>
   * The value of this constant is -1072824312
   * </p>
   */
  MQ_ERROR_OPERATION_CANCELLED(-1072824312),
  /**
   * <p>
   * The value of this constant is -1072824311
   * </p>
   */
  MQ_ERROR_SHARING_VIOLATION(-1072824311),
  /**
   * <p>
   * The value of this constant is -1072824309
   * </p>
   */
  MQ_ERROR_SERVICE_NOT_AVAILABLE(-1072824309),
  /**
   * <p>
   * The value of this constant is -1072824307
   * </p>
   */
  MQ_ERROR_MACHINE_NOT_FOUND(-1072824307),
  /**
   * <p>
   * The value of this constant is -1072824304
   * </p>
   */
  MQ_ERROR_ILLEGAL_SORT(-1072824304),
  /**
   * <p>
   * The value of this constant is -1072824303
   * </p>
   */
  MQ_ERROR_ILLEGAL_USER(-1072824303),
  /**
   * <p>
   * The value of this constant is -1072824301
   * </p>
   */
  MQ_ERROR_NO_DS(-1072824301),
  /**
   * <p>
   * The value of this constant is -1072824300
   * </p>
   */
  MQ_ERROR_ILLEGAL_QUEUE_PATHNAME(-1072824300),
  /**
   * <p>
   * The value of this constant is -1072824296
   * </p>
   */
  MQ_ERROR_ILLEGAL_PROPERTY_VALUE(-1072824296),
  /**
   * <p>
   * The value of this constant is -1072824295
   * </p>
   */
  MQ_ERROR_ILLEGAL_PROPERTY_VT(-1072824295),
  /**
   * <p>
   * The value of this constant is -1072824294
   * </p>
   */
  MQ_ERROR_BUFFER_OVERFLOW(-1072824294),
  /**
   * <p>
   * The value of this constant is -1072824293
   * </p>
   */
  MQ_ERROR_IO_TIMEOUT(-1072824293),
  /**
   * <p>
   * The value of this constant is -1072824292
   * </p>
   */
  MQ_ERROR_ILLEGAL_CURSOR_ACTION(-1072824292),
  /**
   * <p>
   * The value of this constant is -1072824291
   * </p>
   */
  MQ_ERROR_MESSAGE_ALREADY_RECEIVED(-1072824291),
  /**
   * <p>
   * The value of this constant is -1072824290
   * </p>
   */
  MQ_ERROR_ILLEGAL_FORMATNAME(-1072824290),
  /**
   * <p>
   * The value of this constant is -1072824289
   * </p>
   */
  MQ_ERROR_FORMATNAME_BUFFER_TOO_SMALL(-1072824289),
  /**
   * <p>
   * The value of this constant is -1072824288
   * </p>
   */
  MQ_ERROR_UNSUPPORTED_FORMATNAME_OPERATION(-1072824288),
  /**
   * <p>
   * The value of this constant is -1072824287
   * </p>
   */
  MQ_ERROR_ILLEGAL_SECURITY_DESCRIPTOR(-1072824287),
  /**
   * <p>
   * The value of this constant is -1072824286
   * </p>
   */
  MQ_ERROR_SENDERID_BUFFER_TOO_SMALL(-1072824286),
  /**
   * <p>
   * The value of this constant is -1072824285
   * </p>
   */
  MQ_ERROR_SECURITY_DESCRIPTOR_TOO_SMALL(-1072824285),
  /**
   * <p>
   * The value of this constant is -1072824284
   * </p>
   */
  MQ_ERROR_CANNOT_IMPERSONATE_CLIENT(-1072824284),
  /**
   * <p>
   * The value of this constant is -1072824283
   * </p>
   */
  MQ_ERROR_ACCESS_DENIED(-1072824283),
  /**
   * <p>
   * The value of this constant is -1072824282
   * </p>
   */
  MQ_ERROR_PRIVILEGE_NOT_HELD(-1072824282),
  /**
   * <p>
   * The value of this constant is -1072824281
   * </p>
   */
  MQ_ERROR_INSUFFICIENT_RESOURCES(-1072824281),
  /**
   * <p>
   * The value of this constant is -1072824280
   * </p>
   */
  MQ_ERROR_USER_BUFFER_TOO_SMALL(-1072824280),
  /**
   * <p>
   * The value of this constant is -1072824278
   * </p>
   */
  MQ_ERROR_MESSAGE_STORAGE_FAILED(-1072824278),
  /**
   * <p>
   * The value of this constant is -1072824277
   * </p>
   */
  MQ_ERROR_SENDER_CERT_BUFFER_TOO_SMALL(-1072824277),
  /**
   * <p>
   * The value of this constant is -1072824276
   * </p>
   */
  MQ_ERROR_INVALID_CERTIFICATE(-1072824276),
  /**
   * <p>
   * The value of this constant is -1072824275
   * </p>
   */
  MQ_ERROR_CORRUPTED_INTERNAL_CERTIFICATE(-1072824275),
  /**
   * <p>
   * The value of this constant is -1072824274
   * </p>
   */
  MQ_ERROR_INTERNAL_USER_CERT_EXIST(-1072824274),
  /**
   * <p>
   * The value of this constant is -1072824273
   * </p>
   */
  MQ_ERROR_NO_INTERNAL_USER_CERT(-1072824273),
  /**
   * <p>
   * The value of this constant is -1072824272
   * </p>
   */
  MQ_ERROR_CORRUPTED_SECURITY_DATA(-1072824272),
  /**
   * <p>
   * The value of this constant is -1072824271
   * </p>
   */
  MQ_ERROR_CORRUPTED_PERSONAL_CERT_STORE(-1072824271),
  /**
   * <p>
   * The value of this constant is -1072824269
   * </p>
   */
  MQ_ERROR_COMPUTER_DOES_NOT_SUPPORT_ENCRYPTION(-1072824269),
  /**
   * <p>
   * The value of this constant is -1072824267
   * </p>
   */
  MQ_ERROR_BAD_SECURITY_CONTEXT(-1072824267),
  /**
   * <p>
   * The value of this constant is -1072824266
   * </p>
   */
  MQ_ERROR_COULD_NOT_GET_USER_SID(-1072824266),
  /**
   * <p>
   * The value of this constant is -1072824265
   * </p>
   */
  MQ_ERROR_COULD_NOT_GET_ACCOUNT_INFO(-1072824265),
  /**
   * <p>
   * The value of this constant is -1072824264
   * </p>
   */
  MQ_ERROR_ILLEGAL_MQCOLUMNS(-1072824264),
  /**
   * <p>
   * The value of this constant is -1072824263
   * </p>
   */
  MQ_ERROR_ILLEGAL_PROPID(-1072824263),
  /**
   * <p>
   * The value of this constant is -1072824262
   * </p>
   */
  MQ_ERROR_ILLEGAL_RELATION(-1072824262),
  /**
   * <p>
   * The value of this constant is -1072824261
   * </p>
   */
  MQ_ERROR_ILLEGAL_PROPERTY_SIZE(-1072824261),
  /**
   * <p>
   * The value of this constant is -1072824260
   * </p>
   */
  MQ_ERROR_ILLEGAL_RESTRICTION_PROPID(-1072824260),
  /**
   * <p>
   * The value of this constant is -1072824259
   * </p>
   */
  MQ_ERROR_ILLEGAL_MQQUEUEPROPS(-1072824259),
  /**
   * <p>
   * The value of this constant is -1072824258
   * </p>
   */
  MQ_ERROR_PROPERTY_NOTALLOWED(-1072824258),
  /**
   * <p>
   * The value of this constant is -1072824257
   * </p>
   */
  MQ_ERROR_INSUFFICIENT_PROPERTIES(-1072824257),
  /**
   * <p>
   * The value of this constant is -1072824256
   * </p>
   */
  MQ_ERROR_MACHINE_EXISTS(-1072824256),
  /**
   * <p>
   * The value of this constant is -1072824255
   * </p>
   */
  MQ_ERROR_ILLEGAL_MQQMPROPS(-1072824255),
  /**
   * <p>
   * The value of this constant is -1072824254
   * </p>
   */
  MQ_ERROR_DS_IS_FULL(-1072824254),
  /**
   * <p>
   * The value of this constant is -1072824253
   * </p>
   */
  MQ_ERROR_DS_ERROR(-1072824253),
  /**
   * <p>
   * The value of this constant is -1072824252
   * </p>
   */
  MQ_ERROR_INVALID_OWNER(-1072824252),
  /**
   * <p>
   * The value of this constant is -1072824251
   * </p>
   */
  MQ_ERROR_UNSUPPORTED_ACCESS_MODE(-1072824251),
  /**
   * <p>
   * The value of this constant is -1072824250
   * </p>
   */
  MQ_ERROR_RESULT_BUFFER_TOO_SMALL(-1072824250),
  /**
   * <p>
   * The value of this constant is -1072824248
   * </p>
   */
  MQ_ERROR_DELETE_CN_IN_USE(-1072824248),
  /**
   * <p>
   * The value of this constant is -1072824247
   * </p>
   */
  MQ_ERROR_NO_RESPONSE_FROM_OBJECT_SERVER(-1072824247),
  /**
   * <p>
   * The value of this constant is -1072824246
   * </p>
   */
  MQ_ERROR_OBJECT_SERVER_NOT_AVAILABLE(-1072824246),
  /**
   * <p>
   * The value of this constant is -1072824245
   * </p>
   */
  MQ_ERROR_QUEUE_NOT_AVAILABLE(-1072824245),
  /**
   * <p>
   * The value of this constant is -1072824244
   * </p>
   */
  MQ_ERROR_DTC_CONNECT(-1072824244),
  /**
   * <p>
   * The value of this constant is -1072824242
   * </p>
   */
  MQ_ERROR_TRANSACTION_IMPORT(-1072824242),
  /**
   * <p>
   * The value of this constant is -1072824240
   * </p>
   */
  MQ_ERROR_TRANSACTION_USAGE(-1072824240),
  /**
   * <p>
   * The value of this constant is -1072824239
   * </p>
   */
  MQ_ERROR_TRANSACTION_SEQUENCE(-1072824239),
  /**
   * <p>
   * The value of this constant is -1072824235
   * </p>
   */
  MQ_ERROR_MISSING_CONNECTOR_TYPE(-1072824235),
  /**
   * <p>
   * The value of this constant is -1072824234
   * </p>
   */
  MQ_ERROR_STALE_HANDLE(-1072824234),
  /**
   * <p>
   * The value of this constant is -1072824232
   * </p>
   */
  MQ_ERROR_TRANSACTION_ENLIST(-1072824232),
  /**
   * <p>
   * The value of this constant is -1072824230
   * </p>
   */
  MQ_ERROR_QUEUE_DELETED(-1072824230),
  /**
   * <p>
   * The value of this constant is -1072824229
   * </p>
   */
  MQ_ERROR_ILLEGAL_CONTEXT(-1072824229),
  /**
   * <p>
   * The value of this constant is -1072824228
   * </p>
   */
  MQ_ERROR_ILLEGAL_SORT_PROPID(-1072824228),
  /**
   * <p>
   * The value of this constant is -1072824227
   * </p>
   */
  MQ_ERROR_LABEL_TOO_LONG(-1072824227),
  /**
   * <p>
   * The value of this constant is -1072824226
   * </p>
   */
  MQ_ERROR_LABEL_BUFFER_TOO_SMALL(-1072824226),
  /**
   * <p>
   * The value of this constant is -1072824225
   * </p>
   */
  MQ_ERROR_MQIS_SERVER_EMPTY(-1072824225),
  /**
   * <p>
   * The value of this constant is -1072824224
   * </p>
   */
  MQ_ERROR_MQIS_READONLY_MODE(-1072824224),
  /**
   * <p>
   * The value of this constant is -1072824223
   * </p>
   */
  MQ_ERROR_SYMM_KEY_BUFFER_TOO_SMALL(-1072824223),
  /**
   * <p>
   * The value of this constant is -1072824222
   * </p>
   */
  MQ_ERROR_SIGNATURE_BUFFER_TOO_SMALL(-1072824222),
  /**
   * <p>
   * The value of this constant is -1072824221
   * </p>
   */
  MQ_ERROR_PROV_NAME_BUFFER_TOO_SMALL(-1072824221),
  /**
   * <p>
   * The value of this constant is -1072824220
   * </p>
   */
  MQ_ERROR_ILLEGAL_OPERATION(-1072824220),
  /**
   * <p>
   * The value of this constant is -1072824219
   * </p>
   */
  MQ_ERROR_WRITE_NOT_ALLOWED(-1072824219),
  /**
   * <p>
   * The value of this constant is -1072824218
   * </p>
   */
  MQ_ERROR_WKS_CANT_SERVE_CLIENT(-1072824218),
  /**
   * <p>
   * The value of this constant is -1072824217
   * </p>
   */
  MQ_ERROR_DEPEND_WKS_LICENSE_OVERFLOW(-1072824217),
  /**
   * <p>
   * The value of this constant is -1072824216
   * </p>
   */
  MQ_CORRUPTED_QUEUE_WAS_DELETED(-1072824216),
  /**
   * <p>
   * The value of this constant is -1072824215
   * </p>
   */
  MQ_ERROR_REMOTE_MACHINE_NOT_AVAILABLE(-1072824215),
  /**
   * <p>
   * The value of this constant is -1072824214
   * </p>
   */
  MQ_ERROR_UNSUPPORTED_OPERATION(-1072824214),
  /**
   * <p>
   * The value of this constant is -1072824213
   * </p>
   */
  MQ_ERROR_ENCRYPTION_PROVIDER_NOT_SUPPORTED(-1072824213),
  /**
   * <p>
   * The value of this constant is -1072824212
   * </p>
   */
  MQ_ERROR_CANNOT_SET_CRYPTO_SEC_DESCR(-1072824212),
  /**
   * <p>
   * The value of this constant is -1072824211
   * </p>
   */
  MQ_ERROR_CERTIFICATE_NOT_PROVIDED(-1072824211),
  /**
   * <p>
   * The value of this constant is -1072824210
   * </p>
   */
  MQ_ERROR_Q_DNS_PROPERTY_NOT_SUPPORTED(-1072824210),
  /**
   * <p>
   * The value of this constant is -1072824209
   * </p>
   */
  MQ_ERROR_CANT_CREATE_CERT_STORE(-1072824209),
  /**
   * <p>
   * The value of this constant is -1072824209
   * </p>
   */
  MQ_ERROR_CANNOT_CREATE_CERT_STORE(-1072824209),
  /**
   * <p>
   * The value of this constant is -1072824208
   * </p>
   */
  MQ_ERROR_CANT_OPEN_CERT_STORE(-1072824208),
  /**
   * <p>
   * The value of this constant is -1072824208
   * </p>
   */
  MQ_ERROR_CANNOT_OPEN_CERT_STORE(-1072824208),
  /**
   * <p>
   * The value of this constant is -1072824207
   * </p>
   */
  MQ_ERROR_ILLEGAL_ENTERPRISE_OPERATION(-1072824207),
  /**
   * <p>
   * The value of this constant is -1072824206
   * </p>
   */
  MQ_ERROR_CANNOT_GRANT_ADD_GUID(-1072824206),
  /**
   * <p>
   * The value of this constant is -1072824205
   * </p>
   */
  MQ_ERROR_CANNOT_LOAD_MSMQOCM(-1072824205),
  /**
   * <p>
   * The value of this constant is -1072824204
   * </p>
   */
  MQ_ERROR_NO_ENTRY_POINT_MSMQOCM(-1072824204),
  /**
   * <p>
   * The value of this constant is -1072824203
   * </p>
   */
  MQ_ERROR_NO_MSMQ_SERVERS_ON_DC(-1072824203),
  /**
   * <p>
   * The value of this constant is -1072824202
   * </p>
   */
  MQ_ERROR_CANNOT_JOIN_DOMAIN(-1072824202),
  /**
   * <p>
   * The value of this constant is -1072824201
   * </p>
   */
  MQ_ERROR_CANNOT_CREATE_ON_GC(-1072824201),
  /**
   * <p>
   * The value of this constant is -1072824200
   * </p>
   */
  MQ_ERROR_GUID_NOT_MATCHING(-1072824200),
  /**
   * <p>
   * The value of this constant is -1072824199
   * </p>
   */
  MQ_ERROR_PUBLIC_KEY_NOT_FOUND(-1072824199),
  /**
   * <p>
   * The value of this constant is -1072824198
   * </p>
   */
  MQ_ERROR_PUBLIC_KEY_DOES_NOT_EXIST(-1072824198),
  /**
   * <p>
   * The value of this constant is -1072824197
   * </p>
   */
  MQ_ERROR_ILLEGAL_MQPRIVATEPROPS(-1072824197),
  /**
   * <p>
   * The value of this constant is -1072824196
   * </p>
   */
  MQ_ERROR_NO_GC_IN_DOMAIN(-1072824196),
  /**
   * <p>
   * The value of this constant is -1072824195
   * </p>
   */
  MQ_ERROR_NO_MSMQ_SERVERS_ON_GC(-1072824195),
  /**
   * <p>
   * The value of this constant is -1072824194
   * </p>
   */
  MQ_ERROR_CANNOT_GET_DN(-1072824194),
  /**
   * <p>
   * The value of this constant is -1072824193
   * </p>
   */
  MQ_ERROR_CANNOT_HASH_DATA_EX(-1072824193),
  /**
   * <p>
   * The value of this constant is -1072824192
   * </p>
   */
  MQ_ERROR_CANNOT_SIGN_DATA_EX(-1072824192),
  /**
   * <p>
   * The value of this constant is -1072824191
   * </p>
   */
  MQ_ERROR_CANNOT_CREATE_HASH_EX(-1072824191),
  /**
   * <p>
   * The value of this constant is -1072824190
   * </p>
   */
  MQ_ERROR_FAIL_VERIFY_SIGNATURE_EX(-1072824190),
  /**
   * <p>
   * The value of this constant is -1072824189
   * </p>
   */
  MQ_ERROR_CANNOT_DELETE_PSC_OBJECTS(-1072824189),
  /**
   * <p>
   * The value of this constant is -1072824188
   * </p>
   */
  MQ_ERROR_NO_MQUSER_OU(-1072824188),
  /**
   * <p>
   * The value of this constant is -1072824187
   * </p>
   */
  MQ_ERROR_CANNOT_LOAD_MQAD(-1072824187),
  /**
   * <p>
   * The value of this constant is -1072824186
   * </p>
   */
  MQ_ERROR_CANNOT_LOAD_MQDSSRV(-1072824186),
  /**
   * <p>
   * The value of this constant is -1072824185
   * </p>
   */
  MQ_ERROR_PROPERTIES_CONFLICT(-1072824185),
  /**
   * <p>
   * The value of this constant is -1072824184
   * </p>
   */
  MQ_ERROR_MESSAGE_NOT_FOUND(-1072824184),
  /**
   * <p>
   * The value of this constant is -1072824183
   * </p>
   */
  MQ_ERROR_CANT_RESOLVE_SITES(-1072824183),
  /**
   * <p>
   * The value of this constant is -1072824182
   * </p>
   */
  MQ_ERROR_NOT_SUPPORTED_BY_DEPENDENT_CLIENTS(-1072824182),
  /**
   * <p>
   * The value of this constant is -1072824181
   * </p>
   */
  MQ_ERROR_OPERATION_NOT_SUPPORTED_BY_REMOTE_COMPUTER(-1072824181),
  /**
   * <p>
   * The value of this constant is -1072824180
   * </p>
   */
  MQ_ERROR_NOT_A_CORRECT_OBJECT_CLASS(-1072824180),
  /**
   * <p>
   * The value of this constant is -1072824179
   * </p>
   */
  MQ_ERROR_MULTI_SORT_KEYS(-1072824179),
  /**
   * <p>
   * The value of this constant is -1072824178
   * </p>
   */
  MQ_ERROR_GC_NEEDED(-1072824178),
  /**
   * <p>
   * The value of this constant is -1072824177
   * </p>
   */
  MQ_ERROR_DS_BIND_ROOT_FOREST(-1072824177),
  /**
   * <p>
   * The value of this constant is -1072824176
   * </p>
   */
  MQ_ERROR_DS_LOCAL_USER(-1072824176),
  /**
   * <p>
   * The value of this constant is -1072824175
   * </p>
   */
  MQ_ERROR_Q_ADS_PROPERTY_NOT_SUPPORTED(-1072824175),
  /**
   * <p>
   * The value of this constant is -1072824174
   * </p>
   */
  MQ_ERROR_BAD_XML_FORMAT(-1072824174),
  /**
   * <p>
   * The value of this constant is -1072824173
   * </p>
   */
  MQ_ERROR_UNSUPPORTED_CLASS(-1072824173),
  /**
   * <p>
   * The value of this constant is -1072824172
   * </p>
   */
  MQ_ERROR_UNINITIALIZED_OBJECT(-1072824172),
  /**
   * <p>
   * The value of this constant is -1072824171
   * </p>
   */
  MQ_ERROR_CANNOT_CREATE_PSC_OBJECTS(-1072824171),
  /**
   * <p>
   * The value of this constant is -1072824170
   * </p>
   */
  MQ_ERROR_CANNOT_UPDATE_PSC_OBJECTS(-1072824170),
  ;

  private final int value;
  MQERROR(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
