//
//  ViewController.m
//  DiscoverApp
//
//  Created by Joy Hsu on 9/19/15.
//  Copyright © 2015 Joy Hsu. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController
@synthesize iv;


- (void) setImage:(UIImage *) uim {
    iv.image = uim;
}

- (void)leftSwipe:(UISwipeGestureRecognizer*)gestureRecognizer {
    [self setImage:newImage];
    newImage = newd;
    oldImage = curr;
}

- (void)rightSwipe:(UISwipeGestureRecognizer*)gestureRecognizer {
    [self setImage:oldImage];
    newImage = curr;
    oldImage = oldd;
}



- (void)viewDidLoad {
    [super viewDidLoad];
    
    UISwipeGestureRecognizer *rightRecognizer = [[UISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(rightSwipe:)];
    rightRecognizer.direction = UISwipeGestureRecognizerDirectionRight;
    [rightRecognizer setNumberOfTouchesRequired:1];
    [iv addGestureRecognizer:rightRecognizer];
    
    UISwipeGestureRecognizer *leftRecognizer = [[UISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(leftSwipe:)];
    leftRecognizer.direction = UISwipeGestureRecognizerDirectionLeft;
    [leftRecognizer setNumberOfTouchesRequired:1];
    [iv addGestureRecognizer:leftRecognizer];
    
    
    // Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
