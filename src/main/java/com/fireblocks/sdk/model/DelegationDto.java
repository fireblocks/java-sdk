/*
 * Fireblocks API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.6.2
 * Contact: support@fireblocks.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fireblocks.sdk.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fireblocks.sdk.model.RelatedTransactionDto;
import com.fireblocks.sdk.model.SolanaBlockchainDataDto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DelegationDto
 */
@JsonPropertyOrder({
  DelegationDto.JSON_PROPERTY_ID,
  DelegationDto.JSON_PROPERTY_VAULT_ACCOUNT_ID,
  DelegationDto.JSON_PROPERTY_VALIDATOR_NAME,
  DelegationDto.JSON_PROPERTY_PROVIDER_NAME,
  DelegationDto.JSON_PROPERTY_CHAIN_DESCRIPTOR,
  DelegationDto.JSON_PROPERTY_AMOUNT,
  DelegationDto.JSON_PROPERTY_REWARDS_AMOUNT,
  DelegationDto.JSON_PROPERTY_DATE_CREATED,
  DelegationDto.JSON_PROPERTY_STATUS,
  DelegationDto.JSON_PROPERTY_RELATED_TRANSACTIONS,
  DelegationDto.JSON_PROPERTY_VALIDATOR_ADDRESS,
  DelegationDto.JSON_PROPERTY_PROVIDER_ID,
  DelegationDto.JSON_PROPERTY_AVAILABLE_ACTIONS,
  DelegationDto.JSON_PROPERTY_IN_PROGRESS,
  DelegationDto.JSON_PROPERTY_IN_PROGRESS_TX_ID,
  DelegationDto.JSON_PROPERTY_BLOCKCHAIN_POSITION_INFO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DelegationDto {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VAULT_ACCOUNT_ID = "vaultAccountId";
  private String vaultAccountId;

  public static final String JSON_PROPERTY_VALIDATOR_NAME = "validatorName";
  private String validatorName;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "providerName";
  private String providerName;

  public static final String JSON_PROPERTY_CHAIN_DESCRIPTOR = "chainDescriptor";
  private String chainDescriptor;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_REWARDS_AMOUNT = "rewardsAmount";
  private String rewardsAmount;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private String dateCreated;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_RELATED_TRANSACTIONS = "relatedTransactions";
  private List<RelatedTransactionDto> relatedTransactions = new ArrayList<>();

  public static final String JSON_PROPERTY_VALIDATOR_ADDRESS = "validatorAddress";
  private String validatorAddress;

  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  private String providerId;

  public static final String JSON_PROPERTY_AVAILABLE_ACTIONS = "availableActions";
  private List<String> availableActions = new ArrayList<>();

  public static final String JSON_PROPERTY_IN_PROGRESS = "inProgress";
  private Boolean inProgress;

  public static final String JSON_PROPERTY_IN_PROGRESS_TX_ID = "inProgressTxId";
  private String inProgressTxId;

  public static final String JSON_PROPERTY_BLOCKCHAIN_POSITION_INFO = "blockchainPositionInfo";
  private SolanaBlockchainDataDto blockchainPositionInfo;

  public DelegationDto() { 
  }

  public DelegationDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the staking position
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public DelegationDto vaultAccountId(String vaultAccountId) {
    this.vaultAccountId = vaultAccountId;
    return this;
  }

   /**
   * The source vault account to stake from
   * @return vaultAccountId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVaultAccountId() {
    return vaultAccountId;
  }


  @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVaultAccountId(String vaultAccountId) {
    this.vaultAccountId = vaultAccountId;
  }


  public DelegationDto validatorName(String validatorName) {
    this.validatorName = validatorName;
    return this;
  }

   /**
   * The destination validator address name
   * @return validatorName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALIDATOR_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValidatorName() {
    return validatorName;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATOR_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValidatorName(String validatorName) {
    this.validatorName = validatorName;
  }


  public DelegationDto providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * The destination validator provider name
   * @return providerName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProviderName() {
    return providerName;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public DelegationDto chainDescriptor(String chainDescriptor) {
    this.chainDescriptor = chainDescriptor;
    return this;
  }

   /**
   * The protocol identifier (e.g. \&quot;ETH\&quot;/ \&quot;SOL\&quot;) to use
   * @return chainDescriptor
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHAIN_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChainDescriptor() {
    return chainDescriptor;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChainDescriptor(String chainDescriptor) {
    this.chainDescriptor = chainDescriptor;
  }


  public DelegationDto amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of tokens to stake, measured in the staked asset unit.
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public DelegationDto rewardsAmount(String rewardsAmount) {
    this.rewardsAmount = rewardsAmount;
    return this;
  }

   /**
   * The amount staked in the position, measured in the staked asset unit.
   * @return rewardsAmount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REWARDS_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRewardsAmount() {
    return rewardsAmount;
  }


  @JsonProperty(JSON_PROPERTY_REWARDS_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewardsAmount(String rewardsAmount) {
    this.rewardsAmount = rewardsAmount;
  }


  public DelegationDto dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * When was the request made (ISO Date).
   * @return dateCreated
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public DelegationDto status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The current status.
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public DelegationDto relatedTransactions(List<RelatedTransactionDto> relatedTransactions) {
    this.relatedTransactions = relatedTransactions;
    return this;
  }

  public DelegationDto addRelatedTransactionsItem(RelatedTransactionDto relatedTransactionsItem) {
    if (this.relatedTransactions == null) {
      this.relatedTransactions = new ArrayList<>();
    }
    this.relatedTransactions.add(relatedTransactionsItem);
    return this;
  }

   /**
   * An array of transaction objects related to this position. Each object includes a &#39;txId&#39; representing the transaction ID and a &#39;completed&#39; boolean indicating if the transaction was completed.
   * @return relatedTransactions
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RELATED_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RelatedTransactionDto> getRelatedTransactions() {
    return relatedTransactions;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRelatedTransactions(List<RelatedTransactionDto> relatedTransactions) {
    this.relatedTransactions = relatedTransactions;
  }


  public DelegationDto validatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
    return this;
  }

   /**
   * The destination address of the staking transaction.
   * @return validatorAddress
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALIDATOR_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValidatorAddress() {
    return validatorAddress;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATOR_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValidatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
  }


  public DelegationDto providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * The unique identifier of the staking provider
   * @return providerId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProviderId() {
    return providerId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }


  public DelegationDto availableActions(List<String> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  public DelegationDto addAvailableActionsItem(String availableActionsItem) {
    if (this.availableActions == null) {
      this.availableActions = new ArrayList<>();
    }
    this.availableActions.add(availableActionsItem);
    return this;
  }

   /**
   * An array of available actions that can be performed. for example, actions like \&quot;unstake\&quot; or \&quot;withdraw\&quot;.
   * @return availableActions
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVAILABLE_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAvailableActions() {
    return availableActions;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailableActions(List<String> availableActions) {
    this.availableActions = availableActions;
  }


  public DelegationDto inProgress(Boolean inProgress) {
    this.inProgress = inProgress;
    return this;
  }

   /**
   * Indicates whether there is an ongoing action for this position (true if ongoing, false if not).
   * @return inProgress
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IN_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getInProgress() {
    return inProgress;
  }


  @JsonProperty(JSON_PROPERTY_IN_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInProgress(Boolean inProgress) {
    this.inProgress = inProgress;
  }


  public DelegationDto inProgressTxId(String inProgressTxId) {
    this.inProgressTxId = inProgressTxId;
    return this;
  }

   /**
   * The transaction ID of the ongoing request
   * @return inProgressTxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_PROGRESS_TX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInProgressTxId() {
    return inProgressTxId;
  }


  @JsonProperty(JSON_PROPERTY_IN_PROGRESS_TX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInProgressTxId(String inProgressTxId) {
    this.inProgressTxId = inProgressTxId;
  }


  public DelegationDto blockchainPositionInfo(SolanaBlockchainDataDto blockchainPositionInfo) {
    this.blockchainPositionInfo = blockchainPositionInfo;
    return this;
  }

   /**
   * Get blockchainPositionInfo
   * @return blockchainPositionInfo
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_POSITION_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SolanaBlockchainDataDto getBlockchainPositionInfo() {
    return blockchainPositionInfo;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_POSITION_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlockchainPositionInfo(SolanaBlockchainDataDto blockchainPositionInfo) {
    this.blockchainPositionInfo = blockchainPositionInfo;
  }


  /**
   * Return true if this DelegationDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegationDto delegationDto = (DelegationDto) o;
    return Objects.equals(this.id, delegationDto.id) &&
        Objects.equals(this.vaultAccountId, delegationDto.vaultAccountId) &&
        Objects.equals(this.validatorName, delegationDto.validatorName) &&
        Objects.equals(this.providerName, delegationDto.providerName) &&
        Objects.equals(this.chainDescriptor, delegationDto.chainDescriptor) &&
        Objects.equals(this.amount, delegationDto.amount) &&
        Objects.equals(this.rewardsAmount, delegationDto.rewardsAmount) &&
        Objects.equals(this.dateCreated, delegationDto.dateCreated) &&
        Objects.equals(this.status, delegationDto.status) &&
        Objects.equals(this.relatedTransactions, delegationDto.relatedTransactions) &&
        Objects.equals(this.validatorAddress, delegationDto.validatorAddress) &&
        Objects.equals(this.providerId, delegationDto.providerId) &&
        Objects.equals(this.availableActions, delegationDto.availableActions) &&
        Objects.equals(this.inProgress, delegationDto.inProgress) &&
        Objects.equals(this.inProgressTxId, delegationDto.inProgressTxId) &&
        Objects.equals(this.blockchainPositionInfo, delegationDto.blockchainPositionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vaultAccountId, validatorName, providerName, chainDescriptor, amount, rewardsAmount, dateCreated, status, relatedTransactions, validatorAddress, providerId, availableActions, inProgress, inProgressTxId, blockchainPositionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegationDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vaultAccountId: ").append(toIndentedString(vaultAccountId)).append("\n");
    sb.append("    validatorName: ").append(toIndentedString(validatorName)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    chainDescriptor: ").append(toIndentedString(chainDescriptor)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    rewardsAmount: ").append(toIndentedString(rewardsAmount)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    relatedTransactions: ").append(toIndentedString(relatedTransactions)).append("\n");
    sb.append("    validatorAddress: ").append(toIndentedString(validatorAddress)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    availableActions: ").append(toIndentedString(availableActions)).append("\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    inProgressTxId: ").append(toIndentedString(inProgressTxId)).append("\n");
    sb.append("    blockchainPositionInfo: ").append(toIndentedString(blockchainPositionInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `vaultAccountId` to the URL query string
    if (getVaultAccountId() != null) {
      joiner.add(String.format("%svaultAccountId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVaultAccountId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `validatorName` to the URL query string
    if (getValidatorName() != null) {
      joiner.add(String.format("%svalidatorName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValidatorName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `providerName` to the URL query string
    if (getProviderName() != null) {
      joiner.add(String.format("%sproviderName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `chainDescriptor` to the URL query string
    if (getChainDescriptor() != null) {
      joiner.add(String.format("%schainDescriptor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChainDescriptor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rewardsAmount` to the URL query string
    if (getRewardsAmount() != null) {
      joiner.add(String.format("%srewardsAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRewardsAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateCreated` to the URL query string
    if (getDateCreated() != null) {
      joiner.add(String.format("%sdateCreated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateCreated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `relatedTransactions` to the URL query string
    if (getRelatedTransactions() != null) {
      for (int i = 0; i < getRelatedTransactions().size(); i++) {
        if (getRelatedTransactions().get(i) != null) {
          joiner.add(getRelatedTransactions().get(i).toUrlQueryString(String.format("%srelatedTransactions%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `validatorAddress` to the URL query string
    if (getValidatorAddress() != null) {
      joiner.add(String.format("%svalidatorAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValidatorAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `providerId` to the URL query string
    if (getProviderId() != null) {
      joiner.add(String.format("%sproviderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `availableActions` to the URL query string
    if (getAvailableActions() != null) {
      for (int i = 0; i < getAvailableActions().size(); i++) {
        joiner.add(String.format("%savailableActions%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAvailableActions().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `inProgress` to the URL query string
    if (getInProgress() != null) {
      joiner.add(String.format("%sinProgress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInProgress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `inProgressTxId` to the URL query string
    if (getInProgressTxId() != null) {
      joiner.add(String.format("%sinProgressTxId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInProgressTxId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `blockchainPositionInfo` to the URL query string
    if (getBlockchainPositionInfo() != null) {
      joiner.add(getBlockchainPositionInfo().toUrlQueryString(prefix + "blockchainPositionInfo" + suffix));
    }

    return joiner.toString();
  }
}

