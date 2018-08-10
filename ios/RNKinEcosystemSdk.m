
#import "RNKinEcosystemSdk.h"
#import "KinEcosystem-Swift.h"

@implementation RNKinEcosystemSdk

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(startWithAppId:(NSString *)appId userId:(NSString *)userId apiKey:(NSString *)apiKey environment:(NSString *)environment)
{
   [[Kin shared] start:userId apiKey:apiKey appId:appId environment:environment]
}

@end
  