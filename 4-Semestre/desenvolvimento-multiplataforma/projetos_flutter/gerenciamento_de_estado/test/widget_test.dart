// This is a basic Flutter widget test.
//
// To perform an interaction with a widget in your test, use the WidgetTester
// utility in the flutter_test package. For example, you can send tap and scroll
// gestures. You can also use WidgetTester to find child widgets in the widget
// tree, read text, and verify that the values of widget properties are correct.

import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';

import 'package:gerenciamento_de_estado/src/app.dart';

void main() {
  testWidgets('renders login form elements', (WidgetTester tester) async {
    // Build the app and trigger a frame.
    await tester.pumpWidget(App());

    // Verify there are two text fields (email + password).
    expect(find.byType(TextField), findsNWidgets(2));
    // Verify email label appears.
    expect(find.text('Endereço de e-mail'), findsOneWidget);
    // Verify a password field exists (TextField with obscureText: true).
    expect(
      find.byWidgetPredicate((w) => w is TextField && w.obscureText == true),
      findsOneWidget,
    );
    // Verify the Login button.
    expect(find.widgetWithText(ElevatedButton, 'Login'), findsOneWidget);
  });

  testWidgets('allows typing and tapping login', (WidgetTester tester) async {
    await tester.pumpWidget(App());

    // Enter email and password.
    await tester.enterText(find.byType(TextField).at(0), 'user@example.com');
    await tester.enterText(find.byType(TextField).at(1), 'secret');

    // Tap login button.
    await tester.tap(find.widgetWithText(ElevatedButton, 'Login'));
    await tester.pump();

    // No navigation yet, just ensure tap did not throw and fields contain text.
    expect(find.text('user@example.com'), findsOneWidget);
    expect(find.text('secret'), findsOneWidget);
  });
}
