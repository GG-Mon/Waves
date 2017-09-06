package com.wavesplatform.database

import com.wavesplatform.state2.{ByteStr, Diff, StateWriter}
import com.wavesplatform.state2.reader.SnapshotStateReader
import scorex.account.{Address, Alias}
import scorex.block.Block
import scorex.transaction.{History, TransactionParser}

class LevelDBWriter extends SnapshotStateReader with StateWriter with History {
  override def transactionInfo(id: ByteStr) = ???

  override def addressTransactions(address: Address, types: Set[TransactionParser.TransactionType.Value], from: Int, count: Int) = ???

  override def containsTransaction(id: ByteStr) = ???

  override def assetDescription(id: ByteStr) = ???

  override def wavesBalance(a: Address) = ???

  override def assetBalance(a: Address) = ???

  override def leaseBalance(a: Address) = ???

  override def nonZeroLeaseBalances = ???

  override def paymentTransactionIdByHash(hash: ByteStr) = ???

  override def aliasesOfAddress(a: Address) = ???

  override def resolveAlias(a: Alias) = ???

  override def leaseDetails(leaseId: ByteStr) = ???

  override def activeLeases = ???

  override def leaseOverflows = ???

  override def leasesOf(address: Address) = ???

  override def filledVolumeAndFee(orderId: ByteStr) = ???

  override def balanceSnapshots(address: Address, from: Int, to: Int) = ???

  override def append(diff: Diff, block: Block): Unit = ???

  override def rollbackTo(targetBlockId: ByteStr) = ???

  override def status = ???

  override def height = ???

  override def score = ???

  override def scoreOf(blockId: ByteStr) = ???

  override def blockHeaderAndSize(height: Int) = ???

  override def blockHeaderAndSize(blockId: ByteStr) = ???

  override def lastBlock = ???

  override def blockBytes(height: Int) = ???

  override def blockBytes(blockId: ByteStr) = ???

  override def heightOf(blockId: ByteStr) = ???

  override def lastBlockIds(howMany: Int) = ???

  override def blockIdsAfter(parentSignature: ByteStr, howMany: Int) = ???

  override def parent(ofBlock: Block, back: Int) = ???

  override def approvedFeatures() = ???

  override def activatedFeatures() = ???

  override def featureVotes(height: Int) = ???
}
