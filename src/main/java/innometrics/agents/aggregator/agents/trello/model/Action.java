package innometrics.agents.aggregator.agents.trello.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Action {

    private String actionId;
    private String boardId;
    private String idMemberCreator;
    private String emailMemberCreator;
    private String type;
    private String date;
    private String memberCreatorUsername;


    private String boardName;
    private String cardId;
    private String cardName;

    private String cardClosed;
    private String listName;
    private String listId;
    private String checkItemId;
    private String checkItemName;
    private String checkItemState;
    private String checkListId;
    private String checkListName;
    private String listAfterId;
    private String listAfterName;
    private String listBeforeId;
    private String listBeforeName;

    private String attachmentId;
    private String attachmentName;

    private String memberAddedDeletedId;
    private String memberAddedDeletedName;
    private String old;
    private String pluginId;
    private String pluginName;
    private String pluginUrl;


}