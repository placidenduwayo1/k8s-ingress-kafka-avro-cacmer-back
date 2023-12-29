/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package fr.placide.cacmerbsmsmovement.domain.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Account extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2367454015203027247L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Account\",\"namespace\":\"fr.placide.cacmerbsmsmovement.domain.avro\",\"fields\":[{\"name\":\"accountId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"balance\",\"type\":\"double\"},{\"name\":\"overdraft\",\"type\":\"double\"},{\"name\":\"customerId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"customer\",\"type\":{\"type\":\"record\",\"name\":\"Customer\",\"fields\":[{\"name\":\"customerId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"firstname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"createdAt\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"risk\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"status\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Account> ENCODER =
      new BinaryMessageEncoder<Account>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Account> DECODER =
      new BinaryMessageDecoder<Account>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Account> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Account> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Account> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Account>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Account to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Account from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Account instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Account fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String accountId;
  private java.lang.String type;
  private double balance;
  private double overdraft;
  private java.lang.String customerId;
  private fr.placide.cacmerbsmsmovement.domain.avro.Customer customer;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Account() {}

  /**
   * All-args constructor.
   * @param accountId The new value for accountId
   * @param type The new value for type
   * @param balance The new value for balance
   * @param overdraft The new value for overdraft
   * @param customerId The new value for customerId
   * @param customer The new value for customer
   */
  public Account(java.lang.String accountId, java.lang.String type, java.lang.Double balance, java.lang.Double overdraft, java.lang.String customerId, fr.placide.cacmerbsmsmovement.domain.avro.Customer customer) {
    this.accountId = accountId;
    this.type = type;
    this.balance = balance;
    this.overdraft = overdraft;
    this.customerId = customerId;
    this.customer = customer;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return accountId;
    case 1: return type;
    case 2: return balance;
    case 3: return overdraft;
    case 4: return customerId;
    case 5: return customer;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: accountId = value$ != null ? value$.toString() : null; break;
    case 1: type = value$ != null ? value$.toString() : null; break;
    case 2: balance = (java.lang.Double)value$; break;
    case 3: overdraft = (java.lang.Double)value$; break;
    case 4: customerId = value$ != null ? value$.toString() : null; break;
    case 5: customer = (fr.placide.cacmerbsmsmovement.domain.avro.Customer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'accountId' field.
   * @return The value of the 'accountId' field.
   */
  public java.lang.String getAccountId() {
    return accountId;
  }


  /**
   * Sets the value of the 'accountId' field.
   * @param value the value to set.
   */
  public void setAccountId(java.lang.String value) {
    this.accountId = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.String getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.String value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'balance' field.
   * @return The value of the 'balance' field.
   */
  public double getBalance() {
    return balance;
  }


  /**
   * Sets the value of the 'balance' field.
   * @param value the value to set.
   */
  public void setBalance(double value) {
    this.balance = value;
  }

  /**
   * Gets the value of the 'overdraft' field.
   * @return The value of the 'overdraft' field.
   */
  public double getOverdraft() {
    return overdraft;
  }


  /**
   * Sets the value of the 'overdraft' field.
   * @param value the value to set.
   */
  public void setOverdraft(double value) {
    this.overdraft = value;
  }

  /**
   * Gets the value of the 'customerId' field.
   * @return The value of the 'customerId' field.
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }


  /**
   * Sets the value of the 'customerId' field.
   * @param value the value to set.
   */
  public void setCustomerId(java.lang.String value) {
    this.customerId = value;
  }

  /**
   * Gets the value of the 'customer' field.
   * @return The value of the 'customer' field.
   */
  public fr.placide.cacmerbsmsmovement.domain.avro.Customer getCustomer() {
    return customer;
  }


  /**
   * Sets the value of the 'customer' field.
   * @param value the value to set.
   */
  public void setCustomer(fr.placide.cacmerbsmsmovement.domain.avro.Customer value) {
    this.customer = value;
  }

  /**
   * Creates a new Account RecordBuilder.
   * @return A new Account RecordBuilder
   */
  public static fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder newBuilder() {
    return new fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder();
  }

  /**
   * Creates a new Account RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Account RecordBuilder
   */
  public static fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder newBuilder(fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder other) {
    if (other == null) {
      return new fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder();
    } else {
      return new fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder(other);
    }
  }

  /**
   * Creates a new Account RecordBuilder by copying an existing Account instance.
   * @param other The existing instance to copy.
   * @return A new Account RecordBuilder
   */
  public static fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder newBuilder(fr.placide.cacmerbsmsmovement.domain.avro.Account other) {
    if (other == null) {
      return new fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder();
    } else {
      return new fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder(other);
    }
  }

  /**
   * RecordBuilder for Account instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Account>
    implements org.apache.avro.data.RecordBuilder<Account> {

    private java.lang.String accountId;
    private java.lang.String type;
    private double balance;
    private double overdraft;
    private java.lang.String customerId;
    private fr.placide.cacmerbsmsmovement.domain.avro.Customer customer;
    private fr.placide.cacmerbsmsmovement.domain.avro.Customer.Builder customerBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.accountId)) {
        this.accountId = data().deepCopy(fields()[0].schema(), other.accountId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.balance)) {
        this.balance = data().deepCopy(fields()[2].schema(), other.balance);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.overdraft)) {
        this.overdraft = data().deepCopy(fields()[3].schema(), other.overdraft);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.customerId)) {
        this.customerId = data().deepCopy(fields()[4].schema(), other.customerId);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.customer)) {
        this.customer = data().deepCopy(fields()[5].schema(), other.customer);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasCustomerBuilder()) {
        this.customerBuilder = fr.placide.cacmerbsmsmovement.domain.avro.Customer.newBuilder(other.getCustomerBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Account instance
     * @param other The existing instance to copy.
     */
    private Builder(fr.placide.cacmerbsmsmovement.domain.avro.Account other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.accountId)) {
        this.accountId = data().deepCopy(fields()[0].schema(), other.accountId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.balance)) {
        this.balance = data().deepCopy(fields()[2].schema(), other.balance);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.overdraft)) {
        this.overdraft = data().deepCopy(fields()[3].schema(), other.overdraft);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.customerId)) {
        this.customerId = data().deepCopy(fields()[4].schema(), other.customerId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.customer)) {
        this.customer = data().deepCopy(fields()[5].schema(), other.customer);
        fieldSetFlags()[5] = true;
      }
      this.customerBuilder = null;
    }

    /**
      * Gets the value of the 'accountId' field.
      * @return The value.
      */
    public java.lang.String getAccountId() {
      return accountId;
    }


    /**
      * Sets the value of the 'accountId' field.
      * @param value The value of 'accountId'.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder setAccountId(java.lang.String value) {
      validate(fields()[0], value);
      this.accountId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'accountId' field has been set.
      * @return True if the 'accountId' field has been set, false otherwise.
      */
    public boolean hasAccountId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'accountId' field.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder clearAccountId() {
      accountId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.String getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder setType(java.lang.String value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'balance' field.
      * @return The value.
      */
    public double getBalance() {
      return balance;
    }


    /**
      * Sets the value of the 'balance' field.
      * @param value The value of 'balance'.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder setBalance(double value) {
      validate(fields()[2], value);
      this.balance = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'balance' field has been set.
      * @return True if the 'balance' field has been set, false otherwise.
      */
    public boolean hasBalance() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'balance' field.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder clearBalance() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'overdraft' field.
      * @return The value.
      */
    public double getOverdraft() {
      return overdraft;
    }


    /**
      * Sets the value of the 'overdraft' field.
      * @param value The value of 'overdraft'.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder setOverdraft(double value) {
      validate(fields()[3], value);
      this.overdraft = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'overdraft' field has been set.
      * @return True if the 'overdraft' field has been set, false otherwise.
      */
    public boolean hasOverdraft() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'overdraft' field.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder clearOverdraft() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerId' field.
      * @return The value.
      */
    public java.lang.String getCustomerId() {
      return customerId;
    }


    /**
      * Sets the value of the 'customerId' field.
      * @param value The value of 'customerId'.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder setCustomerId(java.lang.String value) {
      validate(fields()[4], value);
      this.customerId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'customerId' field.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder clearCustomerId() {
      customerId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'customer' field.
      * @return The value.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Customer getCustomer() {
      return customer;
    }


    /**
      * Sets the value of the 'customer' field.
      * @param value The value of 'customer'.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder setCustomer(fr.placide.cacmerbsmsmovement.domain.avro.Customer value) {
      validate(fields()[5], value);
      this.customerBuilder = null;
      this.customer = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'customer' field has been set.
      * @return True if the 'customer' field has been set, false otherwise.
      */
    public boolean hasCustomer() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'customer' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public fr.placide.cacmerbsmsmovement.domain.avro.Customer.Builder getCustomerBuilder() {
      if (customerBuilder == null) {
        if (hasCustomer()) {
          setCustomerBuilder(fr.placide.cacmerbsmsmovement.domain.avro.Customer.newBuilder(customer));
        } else {
          setCustomerBuilder(fr.placide.cacmerbsmsmovement.domain.avro.Customer.newBuilder());
        }
      }
      return customerBuilder;
    }

    /**
     * Sets the Builder instance for the 'customer' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder setCustomerBuilder(fr.placide.cacmerbsmsmovement.domain.avro.Customer.Builder value) {
      clearCustomer();
      customerBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'customer' field has an active Builder instance
     * @return True if the 'customer' field has an active Builder instance
     */
    public boolean hasCustomerBuilder() {
      return customerBuilder != null;
    }

    /**
      * Clears the value of the 'customer' field.
      * @return This builder.
      */
    public fr.placide.cacmerbsmsmovement.domain.avro.Account.Builder clearCustomer() {
      customer = null;
      customerBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Account build() {
      try {
        Account record = new Account();
        record.accountId = fieldSetFlags()[0] ? this.accountId : (java.lang.String) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.String) defaultValue(fields()[1]);
        record.balance = fieldSetFlags()[2] ? this.balance : (java.lang.Double) defaultValue(fields()[2]);
        record.overdraft = fieldSetFlags()[3] ? this.overdraft : (java.lang.Double) defaultValue(fields()[3]);
        record.customerId = fieldSetFlags()[4] ? this.customerId : (java.lang.String) defaultValue(fields()[4]);
        if (customerBuilder != null) {
          try {
            record.customer = this.customerBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("customer"));
            throw e;
          }
        } else {
          record.customer = fieldSetFlags()[5] ? this.customer : (fr.placide.cacmerbsmsmovement.domain.avro.Customer) defaultValue(fields()[5]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Account>
    WRITER$ = (org.apache.avro.io.DatumWriter<Account>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Account>
    READER$ = (org.apache.avro.io.DatumReader<Account>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.accountId);

    out.writeString(this.type);

    out.writeDouble(this.balance);

    out.writeDouble(this.overdraft);

    out.writeString(this.customerId);

    this.customer.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.accountId = in.readString();

      this.type = in.readString();

      this.balance = in.readDouble();

      this.overdraft = in.readDouble();

      this.customerId = in.readString();

      if (this.customer == null) {
        this.customer = new fr.placide.cacmerbsmsmovement.domain.avro.Customer();
      }
      this.customer.customDecode(in);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.accountId = in.readString();
          break;

        case 1:
          this.type = in.readString();
          break;

        case 2:
          this.balance = in.readDouble();
          break;

        case 3:
          this.overdraft = in.readDouble();
          break;

        case 4:
          this.customerId = in.readString();
          break;

        case 5:
          if (this.customer == null) {
            this.customer = new fr.placide.cacmerbsmsmovement.domain.avro.Customer();
          }
          this.customer.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









