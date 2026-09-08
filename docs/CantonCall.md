

# CantonCall

## oneOf schemas
* [CantonCallAllocationWithdraw](CantonCallAllocationWithdraw.md)
* [CantonCallAllowListAdd](CantonCallAllowListAdd.md)
* [CantonCallAllowListRemove](CantonCallAllowListRemove.md)
* [CantonCallEndInvestorInvite](CantonCallEndInvestorInvite.md)
* [CantonCallEndInvestorInviteCancel](CantonCallEndInvestorInviteCancel.md)
* [CantonCallEndInvestorOffboard](CantonCallEndInvestorOffboard.md)
* [CantonCallParticipantOnboarding](CantonCallParticipantOnboarding.md)
* [CantonCallTransferWithdraw](CantonCallTransferWithdraw.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.CantonCall;
import com.fireblocks.sdk.model.CantonCallAllocationWithdraw;
import com.fireblocks.sdk.model.CantonCallAllowListAdd;
import com.fireblocks.sdk.model.CantonCallAllowListRemove;
import com.fireblocks.sdk.model.CantonCallEndInvestorInvite;
import com.fireblocks.sdk.model.CantonCallEndInvestorInviteCancel;
import com.fireblocks.sdk.model.CantonCallEndInvestorOffboard;
import com.fireblocks.sdk.model.CantonCallParticipantOnboarding;
import com.fireblocks.sdk.model.CantonCallTransferWithdraw;

public class Example {
    public static void main(String[] args) {
        CantonCall exampleCantonCall = new CantonCall();

        // create a new CantonCallAllocationWithdraw
        CantonCallAllocationWithdraw exampleCantonCallAllocationWithdraw = new CantonCallAllocationWithdraw();
        // set CantonCall to CantonCallAllocationWithdraw
        exampleCantonCall.setActualInstance(exampleCantonCallAllocationWithdraw);
        // to get back the CantonCallAllocationWithdraw set earlier
        CantonCallAllocationWithdraw testCantonCallAllocationWithdraw = (CantonCallAllocationWithdraw) exampleCantonCall.getActualInstance();

        // create a new CantonCallAllowListAdd
        CantonCallAllowListAdd exampleCantonCallAllowListAdd = new CantonCallAllowListAdd();
        // set CantonCall to CantonCallAllowListAdd
        exampleCantonCall.setActualInstance(exampleCantonCallAllowListAdd);
        // to get back the CantonCallAllowListAdd set earlier
        CantonCallAllowListAdd testCantonCallAllowListAdd = (CantonCallAllowListAdd) exampleCantonCall.getActualInstance();

        // create a new CantonCallAllowListRemove
        CantonCallAllowListRemove exampleCantonCallAllowListRemove = new CantonCallAllowListRemove();
        // set CantonCall to CantonCallAllowListRemove
        exampleCantonCall.setActualInstance(exampleCantonCallAllowListRemove);
        // to get back the CantonCallAllowListRemove set earlier
        CantonCallAllowListRemove testCantonCallAllowListRemove = (CantonCallAllowListRemove) exampleCantonCall.getActualInstance();

        // create a new CantonCallEndInvestorInvite
        CantonCallEndInvestorInvite exampleCantonCallEndInvestorInvite = new CantonCallEndInvestorInvite();
        // set CantonCall to CantonCallEndInvestorInvite
        exampleCantonCall.setActualInstance(exampleCantonCallEndInvestorInvite);
        // to get back the CantonCallEndInvestorInvite set earlier
        CantonCallEndInvestorInvite testCantonCallEndInvestorInvite = (CantonCallEndInvestorInvite) exampleCantonCall.getActualInstance();

        // create a new CantonCallEndInvestorInviteCancel
        CantonCallEndInvestorInviteCancel exampleCantonCallEndInvestorInviteCancel = new CantonCallEndInvestorInviteCancel();
        // set CantonCall to CantonCallEndInvestorInviteCancel
        exampleCantonCall.setActualInstance(exampleCantonCallEndInvestorInviteCancel);
        // to get back the CantonCallEndInvestorInviteCancel set earlier
        CantonCallEndInvestorInviteCancel testCantonCallEndInvestorInviteCancel = (CantonCallEndInvestorInviteCancel) exampleCantonCall.getActualInstance();

        // create a new CantonCallEndInvestorOffboard
        CantonCallEndInvestorOffboard exampleCantonCallEndInvestorOffboard = new CantonCallEndInvestorOffboard();
        // set CantonCall to CantonCallEndInvestorOffboard
        exampleCantonCall.setActualInstance(exampleCantonCallEndInvestorOffboard);
        // to get back the CantonCallEndInvestorOffboard set earlier
        CantonCallEndInvestorOffboard testCantonCallEndInvestorOffboard = (CantonCallEndInvestorOffboard) exampleCantonCall.getActualInstance();

        // create a new CantonCallParticipantOnboarding
        CantonCallParticipantOnboarding exampleCantonCallParticipantOnboarding = new CantonCallParticipantOnboarding();
        // set CantonCall to CantonCallParticipantOnboarding
        exampleCantonCall.setActualInstance(exampleCantonCallParticipantOnboarding);
        // to get back the CantonCallParticipantOnboarding set earlier
        CantonCallParticipantOnboarding testCantonCallParticipantOnboarding = (CantonCallParticipantOnboarding) exampleCantonCall.getActualInstance();

        // create a new CantonCallTransferWithdraw
        CantonCallTransferWithdraw exampleCantonCallTransferWithdraw = new CantonCallTransferWithdraw();
        // set CantonCall to CantonCallTransferWithdraw
        exampleCantonCall.setActualInstance(exampleCantonCallTransferWithdraw);
        // to get back the CantonCallTransferWithdraw set earlier
        CantonCallTransferWithdraw testCantonCallTransferWithdraw = (CantonCallTransferWithdraw) exampleCantonCall.getActualInstance();
    }
}
```


