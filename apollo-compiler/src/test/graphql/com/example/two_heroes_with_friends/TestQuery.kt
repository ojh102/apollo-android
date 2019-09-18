// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.two_heroes_with_friends

import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.OperationName
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.ResponseFieldMapper
import com.apollographql.apollo.api.ResponseFieldMarshaller
import com.apollographql.apollo.api.ResponseReader
import com.example.two_heroes_with_friends.type.CustomType
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
class TestQuery : Query<TestQuery.Data, TestQuery.Data, Operation.Variables> {
  override fun operationId(): String = OPERATION_ID
  override fun queryDocument(): String = QUERY_DOCUMENT
  override fun wrapData(data: Data?): Data? = data
  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES
  override fun name(): OperationName = OPERATION_NAME
  override fun responseFieldMapper(): ResponseFieldMapper<Data> = ResponseFieldMapper {
    Data(it)
  }

  data class Node(
    val __typename: String,
    /**
     * The name of the character
     */
    val name: String
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeString(RESPONSE_FIELDS[1], name)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("name", "name", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): Node {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val name = reader.readString(RESPONSE_FIELDS[1])
        return Node(
          __typename = __typename,
          name = name
        )
      }
    }
  }

  data class Edge(
    val __typename: String,
    /**
     * The character represented by this friendship edge
     */
    val node: Node?
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeObject(RESPONSE_FIELDS[1], node?.marshaller())
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forObject("node", "node", null, true, null)
          )

      operator fun invoke(reader: ResponseReader): Edge {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val node = reader.readObject<Node>(RESPONSE_FIELDS[1]) { reader ->
          Node(reader)
        }

        return Edge(
          __typename = __typename,
          node = node
        )
      }
    }
  }

  data class FriendsConnection(
    val __typename: String,
    /**
     * The total number of friends
     */
    val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    val edges: List<Edge?>?
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeInt(RESPONSE_FIELDS[1], totalCount)
      it.writeList(RESPONSE_FIELDS[2], edges) { value, listItemWriter ->
        value?.forEach { value ->
          listItemWriter.writeObject(value?.marshaller())
        }
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forInt("totalCount", "totalCount", null, true, null),
          ResponseField.forList("edges", "edges", null, true, null)
          )

      operator fun invoke(reader: ResponseReader): FriendsConnection {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val totalCount = reader.readInt(RESPONSE_FIELDS[1])
        val edges = reader.readList<Edge>(RESPONSE_FIELDS[2]) {
          it.readObject<Edge> { reader ->
            Edge(reader)
          }

        }
        return FriendsConnection(
          __typename = __typename,
          totalCount = totalCount,
          edges = edges
        )
      }
    }
  }

  data class R2(
    val __typename: String,
    /**
     * The name of the character
     */
    val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    val friendsConnection: FriendsConnection
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeString(RESPONSE_FIELDS[1], name)
      it.writeObject(RESPONSE_FIELDS[2], friendsConnection.marshaller())
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("name", "name", null, false, null),
          ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): R2 {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val name = reader.readString(RESPONSE_FIELDS[1])
        val friendsConnection = reader.readObject<FriendsConnection>(RESPONSE_FIELDS[2]) { reader ->
          FriendsConnection(reader)
        }

        return R2(
          __typename = __typename,
          name = name,
          friendsConnection = friendsConnection
        )
      }
    }
  }

  data class Node1(
    val __typename: String,
    /**
     * The name of the character
     */
    val name: String
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeString(RESPONSE_FIELDS[1], name)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("name", "name", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): Node1 {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val name = reader.readString(RESPONSE_FIELDS[1])
        return Node1(
          __typename = __typename,
          name = name
        )
      }
    }
  }

  data class Edge1(
    val __typename: String,
    /**
     * The character represented by this friendship edge
     */
    val node: Node1?
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeObject(RESPONSE_FIELDS[1], node?.marshaller())
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forObject("node", "node", null, true, null)
          )

      operator fun invoke(reader: ResponseReader): Edge1 {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val node = reader.readObject<Node1>(RESPONSE_FIELDS[1]) { reader ->
          Node1(reader)
        }

        return Edge1(
          __typename = __typename,
          node = node
        )
      }
    }
  }

  data class FriendsConnection1(
    val __typename: String,
    /**
     * The total number of friends
     */
    val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    val edges: List<Edge1?>?
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeInt(RESPONSE_FIELDS[1], totalCount)
      it.writeList(RESPONSE_FIELDS[2], edges) { value, listItemWriter ->
        value?.forEach { value ->
          listItemWriter.writeObject(value?.marshaller())
        }
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forInt("totalCount", "totalCount", null, true, null),
          ResponseField.forList("edges", "edges", null, true, null)
          )

      operator fun invoke(reader: ResponseReader): FriendsConnection1 {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val totalCount = reader.readInt(RESPONSE_FIELDS[1])
        val edges = reader.readList<Edge1>(RESPONSE_FIELDS[2]) {
          it.readObject<Edge1> { reader ->
            Edge1(reader)
          }

        }
        return FriendsConnection1(
          __typename = __typename,
          totalCount = totalCount,
          edges = edges
        )
      }
    }
  }

  data class Luke(
    val __typename: String,
    /**
     * The ID of the character
     */
    val id: String,
    /**
     * The name of the character
     */
    val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    val friendsConnection: FriendsConnection1
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeCustom(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField, id)
      it.writeString(RESPONSE_FIELDS[2], name)
      it.writeObject(RESPONSE_FIELDS[3], friendsConnection.marshaller())
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forCustomType("id", "id", null, false, CustomType.ID, null),
          ResponseField.forString("name", "name", null, false, null),
          ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): Luke {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val id = reader.readCustomType<String>(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField)
        val name = reader.readString(RESPONSE_FIELDS[2])
        val friendsConnection = reader.readObject<FriendsConnection1>(RESPONSE_FIELDS[3]) {
            reader ->
          FriendsConnection1(reader)
        }

        return Luke(
          __typename = __typename,
          id = id,
          name = name,
          friendsConnection = friendsConnection
        )
      }
    }
  }

  data class Data(
    val r2: R2?,
    val luke: Luke?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeObject(RESPONSE_FIELDS[0], r2?.marshaller())
      it.writeObject(RESPONSE_FIELDS[1], luke?.marshaller())
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forObject("r2", "hero", null, true, null),
          ResponseField.forObject("luke", "hero", mapOf<String, Any>(
            "episode" to "EMPIRE"), true, null)
          )

      operator fun invoke(reader: ResponseReader): Data {
        val r2 = reader.readObject<R2>(RESPONSE_FIELDS[0]) { reader ->
          R2(reader)
        }

        val luke = reader.readObject<Luke>(RESPONSE_FIELDS[1]) { reader ->
          Luke(reader)
        }

        return Data(
          r2 = r2,
          luke = luke
        )
      }
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "5ee989fce971d5749e601f42de75f04d03083ce81fa7016d192251d7e9c29612"

    val QUERY_DOCUMENT: String = """
        |query TestQuery {
        |  r2: hero {
        |    __typename
        |    name
        |    friendsConnection {
        |      __typename
        |      totalCount
        |      edges {
        |        __typename
        |        node {
        |          __typename
        |          name
        |        }
        |      }
        |    }
        |  }
        |  luke: hero(episode: EMPIRE) {
        |    __typename
        |    id
        |    name
        |    friendsConnection {
        |      __typename
        |      totalCount
        |      edges {
        |        __typename
        |        node {
        |          __typename
        |          name
        |        }
        |      }
        |    }
        |  }
        |}
        """.trimMargin()

    val OPERATION_NAME: OperationName = OperationName { "TestQuery" }
  }
}
